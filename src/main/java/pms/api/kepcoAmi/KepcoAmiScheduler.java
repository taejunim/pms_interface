package pms.api.kepcoAmi;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pms.api.kepcoAmi.service.KepcoAmiService;
import pms.api.kepcoAmi.service.model.KepcoAmi;

import java.lang.reflect.Type;
import java.net.URI;
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
    //5분 단위 전력소비 데이터(일반) URL
    @Value("${edsm.api.getMinuteUse.url}")
    private String minuteUseUrl;

    public Gson gson = new Gson();

    /**
     * getKepcoAmiData()
     * 한전 AMI 고객 List API 호출 하여 DB 고객정보와 비교
     * 유효한 고객 정보로 15분 단위 호출 후 저장
     **/
    //@Scheduled(cron = "0 1/15 * * * *")
    public void getKepcoAmiData() {

        logger.debug("한전 데이터 Scheduler 실행 ====>");

        final HttpEntity entity = new HttpEntity(new HttpHeaders());
        try {
            /* 고객정보 URL 세팅 */
            String fullMeterUrl = meterUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType;
            URI meterURI = new URI(fullMeterUrl);
            logger.debug("fullMeterUrl : " + fullMeterUrl);
            ResponseEntity<String> meterApiResponse = restTemplate.exchange(meterURI, HttpMethod.GET, entity, String.class);

            if (meterApiResponse.getStatusCode().equals(HttpStatus.OK)) {
                Type listType = new TypeToken<ArrayList<KepcoAmi>>() {
                }.getType();

                JsonObject meterApiResponseApiBody = gson.fromJson(meterApiResponse.getBody(), JsonObject.class);
                List<KepcoAmi> amiList = gson.fromJson(meterApiResponseApiBody.get("custMeterInfoList").toString(), listType);

                //한전 API에서 가져온 AMI 목록 체크
                if (amiList.size() > 0 && amiList.get(0).getCustNo() != null) {

                    HashMap<String,Object> parameter = new HashMap<>();
                    parameter.put("list", amiList);
                    //한전 API에서 가져온 AMI와 CEMS에 등록된 AMI 목록 비교
                    amiList = kepcoAmiService.getRegisterAmi(parameter);

                    //한전 API에서 가져온 미터기 정보와 CEMS에 등록된 미터기 정보 중 매칭되는 것이 있으면, 저압/고압 구분을 위한 API 호출
                    if(amiList.size() > 0 ){
                        String fullCustomerUrl = customerUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType;
                        URI customerURI = new URI(fullCustomerUrl);
                        logger.debug("fullCustomerUrl : " + fullCustomerUrl);
                        ResponseEntity<String> customerApiResponse = restTemplate.exchange(customerURI, HttpMethod.GET, entity, String.class);

                        if (customerApiResponse.getStatusCode().equals(HttpStatus.OK)) {
                            JsonObject customerApiResponseBody = gson.fromJson(customerApiResponse.getBody(), JsonObject.class);
                            List<KepcoAmi> customerList = gson.fromJson(customerApiResponseBody.get("custNoInfoList").toString(), listType);

                            // 포맷 정의
                            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmm");

                            //고압용 조회일시 (실시간)
                            Date highPressureDate = new Date();
                            String highPressureFormatDate = format.format(highPressureDate);

                            //저압용 조회일시 (이틀 전)
                            Calendar calendar =  Calendar.getInstance();
                            calendar.add(Calendar.DATE, -2);
                            Date lowPressureDate = new Date(calendar.getTimeInMillis());
                            String lowPressureFormatDate = format.format(lowPressureDate);

                            //저압이든 고압이든 일자만 다르고 시간은 같음
                            String meteringTime   = highPressureFormatDate.substring(8,10) + getMinute(highPressureFormatDate.substring(10,12));

                            for (KepcoAmi ami : amiList) {//url 정의 (서비스 키, 데이터 타입, 고객번호 SET
                                String useUrl = minuteUseUrl + "?serviceKey=" + serviceKey + "&returnType=" + returnType + "&custNo=" + ami.getCustNo();
                                //저압,고압 여부
                                String lvHvVal = customerList.stream().filter(o -> o.getCustNo().equals(ami.getCustNo())).findFirst().get().getLvHvVal();
                                ami.setLvHvVal(lvHvVal);
                                ami.setMeteringTime(meteringTime);

                                if (lvHvVal.equals("저압")) {
                                    String formatDate = lowPressureFormatDate.substring(0, 8);
                                    ami.setMeteringDate(formatDate);

                                    //URL 검색일시 set
                                    useUrl += "&dateTime=" + formatDate + meteringTime;

                                } else if (lvHvVal.equals("고압")) {
                                    String formatDate = highPressureFormatDate.substring(0, 8);
                                    ami.setMeteringDate(formatDate);

                                    //URL 검색일시 set
                                    useUrl += "&dateTime=" + formatDate + meteringTime;
                                }

                                if ((lvHvVal.equals("저압") && meteringTime.startsWith("00", 2)) || lvHvVal.equals("고압")) {

                                    URI useURI = new URI(useUrl);
                                    logger.debug("요청 한전 API URL :" + useUrl);
                                    ResponseEntity<String> minuteUseApiResponse = restTemplate.exchange(useURI, HttpMethod.GET, entity, String.class);
                                    try {

                                        logger.debug("한전 15분 데이터 조회 결과 --> " + minuteUseApiResponse.toString());
                                        JsonObject jsonObject = gson.fromJson(minuteUseApiResponse.getBody(), JsonObject.class);
                                        JsonArray jsonArray = jsonObject.getAsJsonArray("minuteLpDataInfoList");
                                        jsonObject = gson.fromJson(jsonArray.get(0), JsonObject.class);
                                        ami.setMeteringVal(jsonObject.get("pwr_qty").toString());
                                        ami.setAccmltMeteringVal(jsonObject.get("vld_pwr").toString());
                                    } catch (JsonSyntaxException | ClassCastException e) {
                                        logger.error("minuteUseApiResponse - 15분 단위 전력소비 데이터 JsonSyntaxException | ClassCastException");
                                        logger.error("요청 URI " + useUrl);
                                        logger.error(minuteUseApiResponse.toString());
                                    } catch (Exception e) {
                                        logger.error("전력소비 데이터 Exception 발생");
                                        logger.error(e.getLocalizedMessage());
                                    }

                                //저압은 정각데이터만 제공됨.
                                } else {
                                   ami.setMeteringVal("0");
                                }
                                logger.debug("amiList : " + amiList);
                            }
                            kepcoAmiService.insertAmiData(amiList);
                        }
                    } else {
                        logger.debug("한전 AMI 데이터와 매칭되는 데이터가 없습니다.");
                    }
                } else {
                    logger.error("고객/계기번호 조회에 실패하였습니다.");
                    logger.error(String.valueOf(meterApiResponse));
                }
            }
        } catch (DataIntegrityViolationException e) {
            logger.error("기존에 등록된 한전 AMI 데이터입니다.");
            logger.error(e.getLocalizedMessage());
        } catch (HttpServerErrorException e) {
            logger.error("한전 데이터 수신 실패.");
            logger.error(e.getLocalizedMessage());
        } catch (ResourceAccessException e) {
            logger.error("한전 데이터 호출시 TimeOut 발생");
            logger.error(e.getLocalizedMessage());
        } catch (Exception e){
            logger.error("한전 데이터 Exception 발생.");
            logger.error(e.getLocalizedMessage());
        }
    }

    /**
     * getMinute(hhmm)
     * 현재 시간을 기준으로 15분 단위의 분을 구함
     * 00 ~ 14 : return "00"
     * 15 ~ 29 : return "15"
     * 30 ~ 44 : return "30"
     * 45 ~ 59 : return "45"
     **/
    public String getMinute(String hhmm){

        int time = Integer.parseInt(hhmm);
        String minute = "";

        if(time < 15)       minute = "00";
        else if (time < 30) minute = "15";
        else if (time < 45) minute = "30";
        else                minute = "45";

        return  minute;
    }
}
