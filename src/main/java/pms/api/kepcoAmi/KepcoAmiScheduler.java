package pms.api.kepcoAmi;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pms.api.kepcoAmi.service.KepcoAmiService;
import pms.api.kepcoAmi.service.model.KepcoAmi;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * KepcoAmiScheduler.java
 *
 * Kepco(한전) AMI 정보(EDSM) Scheduler
 *
 * Created by Youyeong Jo on 2022/06/14.
 */
@Component
public class KepcoAmiScheduler {

    //로그 설정
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final KepcoAmiService kepcoAmiService;

    public KepcoAmiScheduler(KepcoAmiService kepcoAmiService) {
        this.kepcoAmiService = kepcoAmiService;
    }

    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    //EDSM 서비스키
    @Value("${edsm.api.serviceKey}")
    private String serviceKey;
    //EDSM 응답 형식(json)
    @Value("${edsm.api.returnType}")
    private String returnType;
    //고객번호 API URL
    @Value("${edsm.api.customer.url}")
    private String customerUrl;
    //계기번호 API URL
    @Value("${edsm.api.meter.url}")
    private String meterUrl;
    //하루 단위 전력소비 데이터(일반) URL
    @Value("${edsm.api.getDayUse.url}")
    private String dayUseUrl;

    //계기 번호 응답용 List
    static List<KepcoAmi> amiList = new ArrayList<>();
    //고객 번호 응답용 List
    static List<KepcoAmi> customerList = new ArrayList<>();

    public Gson gson = new Gson();

    /**
     * getKepcoAmiData()
     * 한전 AMI 고객 List API 호출 하여 DB 고객정보와 비교
     * 유효한 고객 정보로 15분 단위 호출 후 저장
     * 매 시간 40분에 실행
     **/
    //@Scheduled(cron = "0 40 0/1 * * *")
    public void getKepcoAmiData() throws URISyntaxException, ParseException {
        logger.debug("==== 한전 전력 소비 데이터 Scheduler 실행 ====");

        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        if(amiList.size() > 0 && customerList.size() > 0) {
            // 포맷 정의
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Calendar calendar =  Calendar.getInstance();

            //고압용 조회 일시 (당일)
            Date highPressureDate = new Date(calendar.getTimeInMillis());
            String highPressureFormatDate = format.format(highPressureDate);

            //저압용 조회일시 (이틀 전)
            calendar.add(Calendar.DATE, -2);
            Date lowPressureDate = new Date(calendar.getTimeInMillis());
            String lowPressureFormatDate = format.format(lowPressureDate);

            for(KepcoAmi ami: amiList) {
                //저압,고압 여부
                String lvHvVal = customerList.stream().filter(o -> o.getCustNo().equals(ami.getCustNo())).findFirst().get().getLvHvVal();
                if(lvHvVal.equals("고압")) ami.setMeteringDate(highPressureFormatDate);
                else ami.setMeteringDate(lowPressureFormatDate);
            }
            kepcoAmiService.insertApiResultList(amiList);

            //전력 조회 API 호출해야 하는 고객 번호 LIST CALL (미완료 데이터들)
            List<KepcoAmi> apiCallList  = kepcoAmiService.selectCallApiList();
            for (KepcoAmi api : apiCallList) {  //url 정의 (서비스 키, 데이터 타입, 고객번호 SET

                String meterNo = amiList.stream().filter(o -> o.getCustNo().equals(api.getCustNo())).findFirst().get().getMeterNo();
                String dataRequestDt    = api.getDataRequestDt();
                String requestSuccessDt = api.getRequestSuccessDt();

                while(dataRequestDt.compareTo(requestSuccessDt) >= 0) {

                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(format.parse(requestSuccessDt));

                    String useUrl = dayUseUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType + "&custNo=" + api.getCustNo();
                    useUrl += "&date=" + requestSuccessDt;

                    URI useURI = new URI(useUrl);

                    ResponseEntity<String> minuteUseApiResponse = restTemplate.exchange(useURI, HttpMethod.GET, entity, String.class);
                    try {
                        logger.debug("한전 15분 데이터 조회 결과 --> " + minuteUseApiResponse.toString());
                        JsonObject jsonObject = gson.fromJson(minuteUseApiResponse.getBody(), JsonObject.class);
                        JsonArray jsonArray = jsonObject.getAsJsonArray("dayLpDataInfoList");
                        jsonObject = gson.fromJson(jsonArray.get(0), JsonObject.class);

                        calendar2.set(Calendar.HOUR_OF_DAY, 0);
                        calendar2.set(Calendar.MINUTE, 0);
                        calendar2.set(Calendar.SECOND, 0);

                        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");

                        //insert용 List
                        List<KepcoAmi> resultList = new ArrayList<>();

                        //하루 15분 단위 데이터 96개
                        for (int j = 0; j < 96; j++) {

                            KepcoAmi result = new KepcoAmi();

                            result.setCustNo(api.getCustNo());
                            result.setAmiIdx(api.getAmiIdx());
                            result.setMeterNo(meterNo);

                            calendar2.add(Calendar.MINUTE, 15);
                            String time = timeFormat.format(calendar2.getTimeInMillis());

                            result.setMeteringTime(time);

                            String meteringVal = "";

                            if (time.contains("0000")) {
                                Date nextDate = new Date(calendar2.getTimeInMillis());
                                result.setMeteringDate(format.format(nextDate));
                                if(jsonObject.get("pwr_qty2400").toString().replaceAll("\"", "").equals(""))
                                    meteringVal = "0";
                                else meteringVal = jsonObject.get("pwr_qty2400").toString().replaceAll("\"", "");

                                result.setAccmltMeteringVal(jsonObject.get("vld_pwr2400").toString().replaceAll("\"",""));
                            } else {
                                result.setMeteringDate(jsonObject.get("mr_ymd").toString().replaceAll("\"",""));
                                if(jsonObject.get("pwr_qty" + time).toString().replaceAll("\"", "").equals(""))
                                    meteringVal = "0";
                                else meteringVal = jsonObject.get("pwr_qty" + time).toString().replaceAll("\"", "");
                                if (time.substring(2, 4).equals("00")) {
                                    result.setAccmltMeteringVal(jsonObject.get("vld_pwr" + time).toString().replaceAll("\"",""));
                                }
                            }
                            result.setMeteringVal(meteringVal);
                            result.setMeteringTime(time);
                            resultList.add(result);
                        }

                        if (resultList.size() > 0) {
                            resultList.get(0).setRequestSuccessDt(requestSuccessDt);
                            kepcoAmiService.insertAmiData(resultList);
                            requestSuccessDt = format.format(calendar2.getTime());

                        }

                    } catch (JsonSyntaxException | ClassCastException e) {
                        logger.error("minuteUseApiResponse - 15분 단위 전력소비 데이터 JsonSyntaxException | ClassCastException");
                        logger.error("요청 URI " + useUrl);
                        logger.error(minuteUseApiResponse.toString());
                        e.printStackTrace();
                        break;
                    } catch (NullPointerException e) {
                        logger.error("minuteUseApiResponse - 15분 단위 전력소비 데이터 NullPointerException");
                        logger.error("고객 번호 : " + api.getCustNo() + " , 계기 번호 : " + api.getMeterNo());

                        //한전 시스템에 등록된 시점부터 데이터 조회가 가능함.
                        if(minuteUseApiResponse.toString().contains("고객이 해당서비스에 정보제공 동의한 날짜부터 조회가 가능합니다.")) {
                            logger.error("정보제공 일자 아님");

                            JsonObject jsonObject = gson.fromJson(minuteUseApiResponse.getBody(), JsonObject.class);
                            JsonArray jsonArray = jsonObject.getAsJsonArray("dayLpDataInfoList");
                            jsonObject = gson.fromJson(jsonArray.get(0), JsonObject.class);

                            //메세지에서 정보 제공 시작 일자 추출
                            String nullRequestSuccessDt = jsonObject.get("errMsg").toString().replace("고객이 해당서비스에 정보제공 동의한 날짜부터 조회가 가능합니다. 정보제공동의일 : ","").replaceAll("\"","");
                            calendar2.setTime(format.parse(nullRequestSuccessDt));
                            calendar2.add(Calendar.DATE, -1);

                            Date lastDay = new Date(calendar2.getTimeInMillis());
                            KepcoAmi kepcoAmi = new KepcoAmi();
                            kepcoAmi.setAmiIdx(api.getAmiIdx());
                            kepcoAmi.setCustNo(api.getCustNo());
                            kepcoAmi.setRequestSuccessDt(format.format(lastDay));

                            //정보 제공 동의 일자 -1을 한 날짜를 성공 날짜로 저장하여, 다음 스케쥴에 그 날짜부터 데이터를 조회하도록 함.
                            kepcoAmiService.updateSingleApiResult(kepcoAmi);
                            break;
                        } else {
                            logger.error(minuteUseApiResponse.toString());
                            break;
                        }
                    } catch (HttpServerErrorException e) {
                        logger.error("한전  15분 단위 전력 소비 데이터 수신 실패.");
                        logger.error(minuteUseApiResponse.toString());
                        logger.error(e.getLocalizedMessage());
                        break;
                    } catch (ResourceAccessException e) {
                        logger.error("한전  15분 단위 전력 소비 데이터 TimeOut 발생." + useURI);
                        logger.error(minuteUseApiResponse.toString());
                        logger.error(e.getLocalizedMessage());
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        } else logger.debug("계기번호 list size : " + amiList.size() + " , 고객번호 list size : " + customerList.size());

    }

    /**
     * saveKepcoAmiData()
     * 한전 계기번호 목록을 메모리에 저장하고 DB 고객정보와 비교, 매일 08시 44분에 실행
     **/
    //@Scheduled(cron = "0 44 8 * * *")
    public void saveKepcoAmiData() throws URISyntaxException {

        logger.debug("==== 한전 계기 번호 Scheduler 실행 ====");

        try {
            getKepcoAmiInfoData();
            logger.debug("==== 한전 계기 번호 데이터 호출 성공 ====");
        } catch (HttpServerErrorException e) {
            logger.error("한전 계기 번호 데이터 수신 실패. 계기 번호 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoAmiInfoData();
        } catch (ResourceAccessException e) {
            logger.error("한전 계기 번호 데이터 호출시 TimeOut 발생. 계기 번호 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoAmiInfoData();
        } catch (JsonSyntaxException | ClassCastException e) {
            logger.error("meterApiResponseApiBody - 한전 계기 번호 데이터 JsonSyntaxException | ClassCastException. 계기 번호 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoAmiInfoData();
        } catch (Exception e){
            logger.error("한전 계기 번호 데이터 Exception 발생. 계기 번호 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoAmiInfoData();
        }
    }

    /**
     * getKepcoAmiInfoData()
     * 한전 AMI 고객 List API 호출
     **/
    public void getKepcoAmiInfoData() throws URISyntaxException {

        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        //데이터 파싱용 Type 설정
        Type listType = new TypeToken<ArrayList<KepcoAmi>>() {}.getType();

        /* 계기번호 URL 세팅 */
        String fullMeterUrl = meterUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType;
        URI meterURI = new URI(fullMeterUrl);

        ResponseEntity<String> meterApiResponse = restTemplate.exchange(meterURI, HttpMethod.GET, entity, String.class);

        if (meterApiResponse.getStatusCode().equals(HttpStatus.OK)) {
            JsonObject meterApiResponseApiBody = gson.fromJson(meterApiResponse.getBody(), JsonObject.class);
            amiList = gson.fromJson(meterApiResponseApiBody.get("custMeterInfoList").toString(), listType);

            //한전 API에서 가져온 AMI 목록 체크
            if (amiList.size() > 0 && amiList.get(0).getCustNo() != null) {

                HashMap<String, Object> parameter = new HashMap<>();
                parameter.put("list", amiList);
                //한전 API에서 가져온 AMI와 CEMS에 등록된 AMI 목록 비교
                amiList = kepcoAmiService.getRegisterAmi(parameter);
            }
        }
    }

    /**
     * saveKepcoCustomerData()
     * 한전 고객 정보 목록을 메모리에 저장, 매일 08시 50분에 실행
     **/
    //@Scheduled(cron = "0 50 8 * * *")
    public void saveKepcoCustomerData() throws URISyntaxException {

        logger.debug("==== 한전 고객 정보 Scheduler 실행 ====");

        try {
            getKepcoCustomerData();
            logger.debug("==== 한전 고객 정보 데이터 호출 성공 ====");
        } catch (HttpServerErrorException e) {
            logger.error("한전 고객 정보 데이터 수신 실패. 고객 정보 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoCustomerData();
        } catch (ResourceAccessException e) {
            logger.error("한전 고객 정보 데이터 호출시 TimeOut 발생. 고객 정보 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoCustomerData();
        } catch (JsonSyntaxException | ClassCastException e) {
            logger.error("customerApiResponseBody - 한전 고객 정보 데이터 JsonSyntaxException | ClassCastException. 고객 정보 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoCustomerData();
        } catch (Exception e){
            logger.error("한전 고객 정보 데이터 Exception 발생. 고객 정보 API 호출을 재시도 합니다.");
            logger.error(e.getLocalizedMessage());
            getKepcoCustomerData();
        }
    }

    /**
     * getKepcoAmiInfoData()
     * 한전 AMI 고객 정보 List API 호출
     **/
    public void getKepcoCustomerData() throws URISyntaxException {

        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        //데이터 파싱용 Type 설정
        Type listType = new TypeToken<ArrayList<KepcoAmi>>() {}.getType();

        String fullCustomerUrl = customerUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType;
        URI customerURI = new URI(fullCustomerUrl);
        ResponseEntity<String> customerApiResponse = restTemplate.exchange(customerURI, HttpMethod.GET, entity, String.class);

        if (customerApiResponse.getStatusCode().equals(HttpStatus.OK)) {
            JsonObject customerApiResponseBody = gson.fromJson(customerApiResponse.getBody(), JsonObject.class);
            customerList = gson.fromJson(customerApiResponseBody.get("custNoInfoList").toString(), listType);
        }

    }

}
