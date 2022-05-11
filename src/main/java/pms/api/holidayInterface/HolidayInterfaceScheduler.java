package pms.api.holidayInterface;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
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
     * 매달 말일에 공휴일 API 호출 하여 응답값 DB에 저장
     * 매달 말일 23시 55분 실행
     **/
    @Scheduled(cron="0 55 23 L * ?")
    public void getHolidayData() throws URISyntaxException {
        insertHolidayData(false);
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

                //VO 형태로 자동 파싱
                Type listType = new TypeToken<ArrayList<HolidayInterface>>() {
                }.getType();
                List<HolidayInterface> apiResultBody = gson.fromJson(jsonObject.get("item").toString(), listType);

                if (apiResultBody.size() > 0) {
                    holidayInterfaceService.insertHolidayData(apiResultBody);
                }
            }
        } catch (JsonSyntaxException | ClassCastException e){
            System.out.println("holidayApiResponse - 공휴일 데이터 응답 이상");
            System.out.println(holidayApiResponse);
        }
    }
}