package pms.api.holidayInterface;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pms.api.holidayInterface.service.HolidayInterfaceService;
import pms.api.holidayInterface.service.model.HolidayInterface;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * HolidayInterfaceScheduler.java
 *
 * 공휴일 정보 Scheduler
 *
 * Created by Youyeong Jo on 2022/05/10.
 */
@Component
public class HolidayInterfaceScheduler {

    //로그 설정
    private static final Logger logger = LoggerFactory.getLogger(HolidayInterfaceScheduler.class);

    private static HolidayInterfaceService holidayInterfaceService;

    public HolidayInterfaceScheduler(HolidayInterfaceService holidayInterfaceService) {
        HolidayInterfaceScheduler.holidayInterfaceService = holidayInterfaceService;
    }

    //data.go.kr 인증키
    private static String serviceKey;
    //공휴일 API URL
    private static String holidayApiUrl;

    /* static으로 @Value값 사용하기 위한 Inject */
    @Value("${weather.api.serviceKey}")
    public void setServeiceKey(String serviceKey){
        HolidayInterfaceScheduler.serviceKey = serviceKey;
    }
    @Value("${holiday.api.url}")
    private void setHolidayApiUrl(String holidayApiUrl){
        HolidayInterfaceScheduler.holidayApiUrl = holidayApiUrl;
    }

    /**
     * getHolidayData()
     * 매달 말일에 공휴일 API 호출 하여 응답값 DB에 저장(매일 23시 55분에 현재가 말일인지 체크)
     * 매달 말일 23시 55분 실행
     **/
    @Scheduled(cron="0 55 23 * * ?")
    public void getHolidayData() throws URISyntaxException {

        logger.debug("공휴일 Scheduler 실행 ====>");

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat ( "dd");

        Date date = new Date();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        String today = format.format(date);

        //현재 날짜가 말일인지 체크
        if(today.equals(format.format(calendar.getTime()))) {
            logger.debug("다음달 공휴일 데이터 CALL");
            insertHolidayData(false);
        }
    }

    /**
     * insertHolidayData(Boolean isFirst)
     * 최초 실행시 해당 월의 공휴일 데이터를 지우고 새로 공휴일 API 호출 하여 응답값 DB에 저장
     * 최초 실행이 아닐때(말일 실행) 다음 달의 공휴일 데이터를 조회하여 저장
     **/
    public static void insertHolidayData(Boolean isFirst) throws URISyntaxException {

        Gson gson = new Gson();
        RestTemplate restTemplate = new RestTemplate();
        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        String formatDate;

        // 포맷 정의
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");

        if(isFirst) {                                                //이번달 연/월 가져오기
            Date date = new Date();
            formatDate = format.format(date);

            //삭제할 데이터 조건 생성
            HolidayInterface holidayInterface = new HolidayInterface();
            holidayInterface.setSearchStart(formatDate);
            holidayInterface.setSearchEnd(formatDate+"32");
            //해당월 공휴일 데이터 삭제
            holidayInterfaceService.deleteCurrentMonthHolidayData(holidayInterface);
        } else {                                                    //다음달 연/월 가져오기
            Calendar calendar =  Calendar.getInstance();
            calendar.add(Calendar.MONTH, 1);
            Date date = new Date(calendar.getTimeInMillis());
            formatDate = format.format(date);
        }

        /*API URL 세팅*/
        String apiURl = holidayApiUrl + "?serviceKey=" + serviceKey;
        apiURl += "&solYear=" + formatDate.substring(0,4);
        apiURl += "&solMonth=" + formatDate.substring(4,6);

        URI holidayResponseURI = new URI(apiURl);
        ResponseEntity<String> holidayApiResponse = restTemplate.exchange(holidayResponseURI, HttpMethod.GET, entity, String.class);
        try {
            if (holidayApiResponse.getStatusCode() == HttpStatus.OK) {
                JsonObject jsonObject = gson.fromJson(holidayApiResponse.getBody(), JsonObject.class);
                jsonObject = jsonObject.getAsJsonObject("response");
                jsonObject = jsonObject.getAsJsonObject("body");
                jsonObject = jsonObject.getAsJsonObject("items");

                if(jsonObject.get("item").isJsonArray()){
                    //VO 형태로 자동 파싱
                    Type listType = new TypeToken<ArrayList<HolidayInterface>>() {
                    }.getType();
                    List<HolidayInterface> apiResultBody = gson.fromJson(jsonObject.get("item").toString(), listType);
                    holidayInterfaceService.insertHolidayData(apiResultBody);

                } else {
                    //VO 형태로 자동 파싱
                    Type type = new TypeToken<HolidayInterface>() {
                    }.getType();
                    List<HolidayInterface> apiResultBody = new ArrayList<>();
                    apiResultBody.add(gson.fromJson(jsonObject.get("item").toString(), type));
                    holidayInterfaceService.insertHolidayData(apiResultBody);
                }
            }
        } catch (JsonSyntaxException | ClassCastException e) {
            logger.error("holidayApiResponse - 공휴일 데이터 JsonSyntaxException | ClassCastException");
            logger.error("요청 URI" + apiURl);
            logger.error(holidayApiResponse.toString());
        }
    }
}