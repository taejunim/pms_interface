package pms.api.kepcoAmi;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
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
import pms.api.kepcoAmi.service.vo.KepcoAmiVO;

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

    //전력 소비 데이터 호출 결과 코드 - 성공
    @Value("${edsm.api.success}")
    private String success;
    //전력 소비 데이터 호출 결과 코드 - 살패
    @Value("${edsm.api.error}")
    private String fail;
    //15분 단위 전력 소비 데이터 존재 안함 메세지
    @Value("${edsm.api.error.msg.noMinuteData}")
    private String noMinuteDataMessage;

    //계기 번호 응답용 List
    static List<KepcoAmiVO> amiList = new ArrayList<>();
    //고객 번호 응답용 List
    static List<KepcoAmiVO> customerList = new ArrayList<>();

    public Gson gson = new Gson();

    /**
     * getKepcoAmiData()
     * 한전 AMI 고객 List API 호출 하여 DB 고객정보와 비교
     * 유효한 고객 정보로 15분 단위 호출 후 저장
     * 매 시간 정각 실행
     **/
    @Scheduled(cron = "0 0 0/1 * * *")
    public void getKepcoAmiData() throws URISyntaxException, ParseException {
        logger.debug("==== 한전 전력 소비 데이터 Scheduler 실행 ====");

        final HttpEntity entity     = new HttpEntity(new HttpHeaders());

        // 포맷 정의
        SimpleDateFormat format     = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");

        //개발용 메소드 test(); 계기번호와 고객번호 자동으로 세팅해줌. 개발시에 주석 풀고 사용.
        if(amiList.size() > 0 && customerList.size() > 0) {
            logger.debug("==== 한전 전력 소비 데이터 Scheduler 실행 ====??");
            Calendar calendar             =  Calendar.getInstance();

            //고압용 조회 일시 (당일)
            Date highPressureDate         = new Date(calendar.getTimeInMillis());
            String highPressureFormatDate = format.format(highPressureDate);

            //저압용 조회일시 (이틀 전)
            calendar.add(Calendar.DATE, -1);
            Date lowPressureDate          = new Date(calendar.getTimeInMillis());
            String lowPressureFormatDate  = format.format(lowPressureDate);

            //계기번호-고객번호를 이용해서 해당 고객이 저압인지 고압인지 저장.
            for(KepcoAmiVO ami: amiList) {
                //저압,고압 여부
                String lvHvVal = customerList.stream().filter(o -> o.getCustNo().equals(ami.getCustNo())).findFirst().get().getLvHvVal();
                if(lvHvVal.equals("고압")) {
                    ami.setMeteringDate(highPressureFormatDate);
                    ami.setLvHvVal("고압");
                }
                else ami.setMeteringDate(lowPressureFormatDate);
            }
            kepcoAmiService.insertApiResultList(amiList);

            //전력 조회 API 호출해야 하는 고객 번호 LIST CALL (미완료 데이터들)
            List<KepcoAmiVO> apiCallList  = kepcoAmiService.selectCallApiList(amiList);

            for (KepcoAmiVO api : apiCallList) {  //url 정의 (서비스 키, 데이터 타입, 고객번호 SET
                boolean noDataUpdateExist = false;

                String meterNo = amiList.stream().filter(o -> o.getCustNo().equals(api.getCustNo())).findFirst().get().getMeterNo();
                String dataRequestDt    = api.getDataRequestDt();
                String requestSuccessDt = api.getRequestSuccessDt();

                while(dataRequestDt.compareTo(requestSuccessDt) >= 0) {

                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(format.parse(requestSuccessDt));

                    String useUrl = dayUseUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType + "&custNo=" + api.getCustNo();
                    useUrl += "&date=" + requestSuccessDt;

                    URI useURI = new URI(useUrl);

                    String resultMessage = "";

                    try{
                        ResponseEntity<String> minuteUseApiResponse = restTemplate.exchange(useURI, HttpMethod.GET, entity, String.class);
                        resultMessage = minuteUseApiResponse.getBody();

                        logger.debug("한전 15분 데이터 조회 결과 --> " + minuteUseApiResponse.toString());
                        JsonObject jsonObject = gson.fromJson(minuteUseApiResponse.getBody(), JsonObject.class);
                        JsonArray jsonArray = jsonObject.getAsJsonArray("dayLpDataInfoList");
                        jsonObject = gson.fromJson(jsonArray.get(0), JsonObject.class);

                        calendar2.set(Calendar.HOUR_OF_DAY, 0);
                        calendar2.set(Calendar.MINUTE, 0);
                        calendar2.set(Calendar.SECOND, 0);

                        //insert용 List
                        List<KepcoAmiVO> resultList   = new ArrayList<>();
                        double tmpAccmltMeteringVal = 0;

                        //하루 15분 단위 데이터 96개
                        for (int j = 0; j < 96; j++) {

                            boolean noDataExist = false;
                            KepcoAmiVO result = new KepcoAmiVO();

                            if(dataRequestDt.equals(highPressureFormatDate)){
                                result.setLvHvVal("고압");
                            } else result.setLvHvVal("저압");

                            result.setCustNo(api.getCustNo());
                            result.setAmiIdx(api.getAmiIdx());
                            result.setMeterNo(meterNo);

                            calendar2.add(Calendar.MINUTE, 15);
                            String time = timeFormat.format(calendar2.getTimeInMillis());

                            result.setMeteringTime(time);

                            String meteringVal = null;


                            //데이터 파싱
                            result.setMeteringDate(jsonObject.get("mr_ymd").toString().replaceAll("\"",""));

                            //자정일 때 시간 0000 -> 2400
                            if(time.equals("0000")) time = "2400";

                            //데이터 누락시
                            if(jsonObject.get("pwr_qty" + time).toString().replaceAll("\"", "").equals("")) {
                                noDataUpdateExist = true;
                                noDataExist = true;
                                if(result.getLvHvVal().equals("고압")) {
                                    int minuteDiff = (96 - j) * 15;
                                    calendar2.add(Calendar.MINUTE, minuteDiff);
                                    break;
                                }
                            }
                            //데이터 존재
                            else {
                                meteringVal = jsonObject.get("pwr_qty" + time).toString().replaceAll("\"", "");

                                //정각 AND 누적 데이터 누락 아닐 때
                                if (time.startsWith("00", 2) && !jsonObject.get("vld_pwr" + time).toString().replaceAll("\"","").equals("")) {
                                    Double accmltMeteringVal = Double.parseDouble(jsonObject.get("vld_pwr" + time).toString().replaceAll("\"",""));

                                    //누적 데이터는 누락이 아니지만 측정값이 누락일 때
                                    if(meteringVal.equals("0") && tmpAccmltMeteringVal != tmpAccmltMeteringVal) {
                                        meteringVal = String.valueOf(accmltMeteringVal - tmpAccmltMeteringVal);
                                    }
                                    tmpAccmltMeteringVal = accmltMeteringVal;
                                }
                                //정각이 아닐 때
                                else {
                                    if(tmpAccmltMeteringVal != 0)
                                        tmpAccmltMeteringVal += Double.parseDouble(meteringVal);
                                }
                            }

                            if(noDataExist) {
                                result.setApiCallResult(fail);
                                result.setErrorResponseMsg(noMinuteDataMessage);
                            } else {
                                result.setMeteringVal(meteringVal);
                                result.setApiCallResult(success);
                            }
                            result.setMeteringTime(time);
                            result.setAccmltMeteringVal(Double.toString(tmpAccmltMeteringVal));

                            resultList.add(result);
                        }

                        if (resultList.size() > 0) {
                            resultList.get(0).setRequestSuccessDt(requestSuccessDt);
                            kepcoAmiService.insertAmiData(resultList, noDataUpdateExist);
                            requestSuccessDt = format.format(calendar2.getTime());

                            Date compareDate = new Date(calendar2.getTimeInMillis());
                            //한전에서 누락된 데이터를 조회하는 기간(5일)이 초과되었을 경우. API 결과 테이블 +1일 (완전히 누락되는 데이터는 조회하지 않음)
                            if(((highPressureDate.getTime() - compareDate.getTime())/(24*60*60*1000)) > 5) {
                                resultList.get(0).setRequestSuccessDt(resultList.get(0).getMeteringDate());
                                kepcoAmiService.updateSingleApiResult(resultList.get(0));
                            }
                        }

                    } catch (JsonSyntaxException | ClassCastException e) {
                        logger.error("minuteUseApiResponse - 15분 단위 전력소비 데이터 JsonSyntaxException | ClassCastException");
                        logger.error("요청 URI " + useUrl);
                        logger.error(resultMessage);
                        break;
                    } catch (NullPointerException e) {
                        logger.error("minuteUseApiResponse - 15분 단위 전력소비 데이터 NullPointerException");
                        logger.error("고객 번호 : " + api.getCustNo() + " , AMI IDX : " + api.getAmiIdx());

                        JsonObject jsonObject = gson.fromJson(resultMessage, JsonObject.class);
                        JsonArray jsonArray = jsonObject.getAsJsonArray("dayLpDataInfoList");
                        jsonObject = gson.fromJson(jsonArray.get(0), JsonObject.class);

                        String  errMsg = jsonObject.get("errMsg").toString().replaceAll("\"", "");

                        //한전 시스템에 등록된 시점부터 데이터 조회가 가능함. -> 해당 날짜부터 데이터 조회하도록 처리.
                        if(resultMessage.contains("고객이 해당서비스에 정보제공 동의한 날짜부터 조회가 가능합니다.")) {
                            logger.error("정보제공 일자 아님");

                            //메세지에서 정보 제공 시작 일자 추출
                            String nullRequestSuccessDt = errMsg.replace("고객이 해당서비스에 정보제공 동의한 날짜부터 조회가 가능합니다. 정보제공동의일 : ", "").replaceAll("\"", "");
                            calendar2.setTime(format.parse(nullRequestSuccessDt));
                            calendar2.add(Calendar.DATE, -1);

                            Date lastDay = new Date(calendar2.getTimeInMillis());
                            KepcoAmiVO kepcoAmiVO = new KepcoAmiVO();
                            kepcoAmiVO.setAmiIdx(api.getAmiIdx());
                            kepcoAmiVO.setCustNo(api.getCustNo());
                            kepcoAmiVO.setRequestSuccessDt(format.format(lastDay));

                            //정보 제공 동의 일자 -1을 한 날짜를 성공 날짜로 저장하여, 다음 스케쥴에 그 날짜부터 데이터를 조회하도록 함.
                            kepcoAmiService.updateSingleApiResult(kepcoAmiVO);
                            break;
                        } else {
                          //데이터가 존재하지 않을때 (다음 날짜에 대한 조회는 진행)
                            logger.error(resultMessage);

                            KepcoAmiVO errorData = api;

                            calendar2.add(Calendar.DATE, 1);

                            requestSuccessDt = format.format(calendar2.getTimeInMillis());
                            Date compareDate = new Date(calendar2.getTimeInMillis());

                            errorData.setMeteringDate(requestSuccessDt);
                            errorData.setMeteringTime(timeFormat.format(calendar2.getTimeInMillis()));

                            //한전에서 누락된 데이터를 조회하는 기간(5일)이 초과되었을 경우. API 결과 테이블 +1일 (완전히 누락되는 데이터는 조회하지 않음)
                            if(((highPressureDate.getTime() - compareDate.getTime())/(24*60*60*1000)) > 5) {
                                errorData.setRequestSuccessDt(errorData.getMeteringDate());
                                kepcoAmiService.updateSingleApiResult(errorData);
                            }
                        }
                    } catch (HttpServerErrorException e) {
                        logger.error("한전  15분 단위 전력 소비 데이터 수신 실패.");
                        logger.error(e.getLocalizedMessage());
                        break;
                    } catch (ResourceAccessException e) {
                        logger.error("한전  15분 단위 전력 소비 데이터 TimeOut 발생." + useURI);
                        logger.error(e.getLocalizedMessage());
                        break;
                    } catch (Exception e) {
                        logger.error("한전  15분 단위 전력 소비 데이터 Exception 발생.");
                        logger.error(e.getLocalizedMessage());
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
    @Scheduled(cron = "0 44 8 * * *")
    public void saveKepcoAmiData() {

        logger.debug("==== 한전 계기 번호 Scheduler 실행 ====");
        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        while(true) {
            try {
                //데이터 파싱용 Type 설정
                Type listType = new TypeToken<ArrayList<KepcoAmiVO>>() {
                }.getType();

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
                        amiList = kepcoAmiService.selectRegisterAmi(parameter);
                        logger.debug("==== 한전 계기 번호 데이터 호출 성공 ====");
                        break;
                    }
                }
            } catch (HttpServerErrorException e) {
                logger.error("한전 계기 번호 데이터 수신 실패. 계기 번호 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            } catch (ResourceAccessException e) {
                logger.error("한전 계기 번호 데이터 호출시 TimeOut 발생. 계기 번호 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            } catch (JsonSyntaxException | ClassCastException e) {
                logger.error("meterApiResponseApiBody - 한전 계기 번호 데이터 JsonSyntaxException | ClassCastException. 계기 번호 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            } catch (Exception e) {
                logger.error("한전 계기 번호 데이터 Exception 발생. 계기 번호 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            }
        }
    }

    /**
     * saveKepcoCustomerData()
     * 한전 고객 정보 목록을 메모리에 저장, 매일 08시 50분에 실행
     **/
    @Scheduled(cron = "0 50 8 * * *")
    public void saveKepcoCustomerData() {

        logger.debug("==== 한전 고객 정보 Scheduler 실행 ====");
        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        while (true) {
            try {
                //데이터 파싱용 Type 설정
                Type listType = new TypeToken<ArrayList<KepcoAmiVO>>() {}.getType();

                String fullCustomerUrl = customerUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType;
                URI customerURI = new URI(fullCustomerUrl);
                ResponseEntity<String> customerApiResponse = restTemplate.exchange(customerURI, HttpMethod.GET, entity, String.class);

                if (customerApiResponse.getStatusCode().equals(HttpStatus.OK)) {
                    JsonObject customerApiResponseBody = gson.fromJson(customerApiResponse.getBody(), JsonObject.class);
                    customerList = gson.fromJson(customerApiResponseBody.get("custNoInfoList").toString(), listType);
                    logger.debug("==== 한전 고객 정보 데이터 호출 성공 ====");
                    break;
                }
            } catch (HttpServerErrorException e) {
                logger.error("한전 고객 정보 데이터 수신 실패. 고객 정보 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            } catch (ResourceAccessException e) {
                logger.error("한전 고객 정보 데이터 호출시 TimeOut 발생. 고객 정보 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            } catch (JsonSyntaxException | ClassCastException e) {
                logger.error("customerApiResponseBody - 한전 고객 정보 데이터 JsonSyntaxException | ClassCastException. 고객 정보 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            } catch (Exception e) {
                logger.error("한전 고객 정보 데이터 Exception 발생. 고객 정보 API 호출을 재시도 합니다.");
                logger.error(e.getLocalizedMessage());
            }
        }
    }
}
