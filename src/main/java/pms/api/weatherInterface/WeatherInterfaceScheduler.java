package pms.api.weatherInterface;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pms.api.weatherInterface.service.model.WeatherInterface;
import pms.api.weatherInterface.service.WeatherInterfaceService;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * WeatherInterfaceScheduler.java
 *
 * 날씨 정보 Scheduler
 *
 * Created by Youyeong Jo on 2022/04/15.
 */

@Component
public class WeatherInterfaceScheduler {

    //로그 설정
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final WeatherInterfaceService WeatherInterfaceService;

    public WeatherInterfaceScheduler(WeatherInterfaceService weatherInterfaceService) {
        this.WeatherInterfaceService = weatherInterfaceService;
    }

    //data.go.kr 인증키
    @Value("${weather.api.serviceKey}")
    private String serviceKey;
    //공공데이터포털 응답 형식
    @Value("${weather.api.dataType}")
    private String dataType;
    //페이지 번호
    @Value("${weather.api.pageNo}")
    private String pageNo;
    //인코딩 타입
    @Value("${weather.api.encoding}")
    private String encoding;

    //초단기 예보 API URL
    @Value("${weather.api.forecast.url}")
    private String weatherForecastApiUrl;
    //페이지 결과 수 - 날씨
    @Value("${weather.api.forecast.numOfRows}")
    private String weatherNumOfRows;
    //초단기 예보 지역 코드 - 제주
    @Value("${weather.api.forecast.nx}")
    private String nx;
    @Value("${weather.api.forecast.ny}")
    private String ny;

    //일몰 일출 API URL
    @Value("${weather.api.sun.url}")
    private String sunriseSunsetApiUrl;
    //일몰 일출 API 지역
    @Value("${weather.api.sun.location}")
    private String sunsetSunriseApiLocation;

    //미세먼지 API URL
    @Value("${weather.api.dust.url}")
    private String fineDustApiUrl;
    //페이지 결과 수 - 미세먼지
    @Value("${weather.api.dust.numOfRows}")
    private String fineDustNumOfRows;
    //미세 먼지 API 측정소
    @Value("${weather.api.dust.station}")
    private String fineDustStationName;
    //미세 먼지 API 측정 주기
    @Value("${weather.api.dust.dataTerm}")
    private String fineDustDataTerm;
    //미세 먼지 API 버전
    @Value("${weather.api.dust.version}")
    private String fineDustVersion;

    public Gson gson = new Gson();

    /**
     * getWeatherData()
     * 매 시간 10분에 날씨 관련 API 호출 하여 응답값 DB에 저장
     * 실제 반영 시에는 주석을 해제하여 반영
     **/
    //@Scheduled(cron="0 10 0/1 * * *" )
    public void getWeatherData() throws URISyntaxException, UnsupportedEncodingException {

        RestTemplate restTemplate = new RestTemplate();
        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        WeatherInterface weatherInterface = new WeatherInterface();
        /* 초단기 예보 데이터 START */
        URI weatherResponseURI = new URI(makeFullURI(weatherForecastApiUrl));

        ResponseEntity<String> weatherApiResponse = restTemplate.exchange(weatherResponseURI, HttpMethod.GET, entity, String.class);

        try {
            // 포맷 정의
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH");
            Date date = new Date();

            //서버 에러 발생시, 측정일과 측정시간은 담아주기 위함.
            String fcstDate = format.format(date);
            String fcstTime = timeFormat.format(date) + "00";
            weatherInterface.setNx(Integer.parseInt(nx));
            weatherInterface.setNy(Integer.parseInt(ny));
            weatherInterface.setBaseDate(fcstDate);
            weatherInterface.setBaseTime(fcstTime);

            logger.debug("weatherApiResponse : " +  weatherApiResponse);

            if(!Objects.requireNonNull(weatherApiResponse.getBody()).contains("html")) {
                JsonObject weatherResult = getApiResultBody(weatherApiResponse);

                if (weatherResult != null && weatherResult.size() > 0) {
                    JsonObject items = weatherResult.getAsJsonObject("items");
                    JsonArray item = items.getAsJsonArray("item");

                    for (int i = 0; i < item.size(); i++) {
                        JsonObject indexItem = (JsonObject) item.get(i);
                        /*
                         * - 자료구분 코드 정보
                         *    T1H - 기온 (단위: ℃)
                         *    SKY - 하늘상태 (맑음, 구름많음, 흐림)
                         *    REH - 습도 (단위: %)
                         *    PCP - 1시간 강수량
                         *    WSD - 풍속 (단위: m/s)
                         */
                        if (indexItem.get("fcstTime").toString().contains(fcstTime)) {
                            String category = indexItem.get("category").toString().replace("\"", "");

                            switch (category) {
                                case "T1H":
                                    weatherInterface.setTemp(indexItem.get("fcstValue").getAsInt());
                                    break;
                                case "SKY":
                                    weatherInterface.setSky(Integer.parseInt(indexItem.get("fcstValue").toString().replace("\"", "")));
                                    break;
                                case "REH":
                                    weatherInterface.setReh(indexItem.get("fcstValue").getAsString());
                                    break;
                                case "PCP":
                                    weatherInterface.setRn1(Integer.parseInt(indexItem.get("fcstValue").toString().replace("\"", "")));
                                    break;
                                case "WSD":
                                    weatherInterface.setWsd(indexItem.get("fcstValue").toString().replace("\"", ""));
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException | JsonSyntaxException | ClassCastException e) {
            logger.error("weatherApiResponse - 초단기 예보 데이터 JsonSyntaxException/ClassCastException/NullPointerException");
            logger.error("요청 URI :" + weatherResponseURI.toString());
            logger.error(weatherApiResponse.toString());
        }
        /* 초단기 예보 데이터 END */

        /* 일출,일몰 데이터 START */
        URI sunsetSunriseResponseURI = new URI(makeFullURI(sunriseSunsetApiUrl));

        ResponseEntity<String> sunriseSunsetApiResponse = restTemplate.exchange(sunsetSunriseResponseURI, HttpMethod.GET, entity, String.class);
        try {

            logger.debug("sunriseSunsetApiResponse : " +  sunriseSunsetApiResponse);

            if(!Objects.requireNonNull(sunriseSunsetApiResponse.getBody()).contains("html")) {
                JsonObject sunriseSunsetResult = getApiResultBody(sunriseSunsetApiResponse);
                if (sunriseSunsetResult != null && sunriseSunsetResult.size() > 0) {
                    JsonObject items = (JsonObject) sunriseSunsetResult.get("items");
                    if (items.size() > 0) {
                        JsonObject item = items.getAsJsonObject("item");
                        String sunrise = item.get("sunrise").toString();
                        String sunset = item.get("sunset").toString();
                        weatherInterface.setSunrise(sunrise.substring(1, 3) + ":" + sunrise.substring(3, 5));
                        weatherInterface.setSunset(sunset.substring(1, 3) + ":" + sunset.substring(3, 5));
                    }
                }
            }
        } catch (NullPointerException | JsonSyntaxException | ClassCastException e) {
            logger.error("sunriseSunsetApiResponse - 일몰 일출 데이터 JsonSyntaxException/ClassCastException/NullPointerException");
            logger.error("요청 URI --> " + sunsetSunriseResponseURI.toString());
            logger.error(sunriseSunsetApiResponse.toString());
        }
        /* 일출,일몰 데이터 END */

        /* 미세 먼지 데이터 START */
        URI fineDustResponseURI = new URI(makeFullURI(fineDustApiUrl));

        ResponseEntity<String> fineDustApiResponse = restTemplate.exchange(fineDustResponseURI, HttpMethod.GET, entity, String.class);

        try {

            logger.debug("fineDustApiResponse : " +  fineDustApiResponse);

            if(!Objects.requireNonNull(fineDustApiResponse.getBody()).contains("html")) {
                JsonObject fineDustResult = getApiResultBody(fineDustApiResponse);
                if (fineDustResult != null && fineDustResult.size() > 0) {
                    JsonArray items = (JsonArray) fineDustResult.get("items");
                    if (items.size() > 0) {
                        JsonObject item = (JsonObject) items.get(0);
                        weatherInterface.setPm10(item.get("pm10Flag").isJsonNull() ? item.get("pm10Value").toString().replace("\"", "") : "");
                    }
                }
            }
        } catch (NullPointerException | JsonSyntaxException | ClassCastException e) {
            logger.error("fineDustApiResponse - 미세 먼지 데이터 JsonSyntaxException/ClassCastException");
            logger.error("요청 URL : " + fineDustResponseURI.toString());
            logger.error(fineDustApiResponse.toString());
        }
        /* 미세 먼지 데이터 END */
        WeatherInterfaceService.insertWeatherData(weatherInterface);
    }

    /**
     * getApiResultBody(ResponseEntity<String> apiResponse)
     * API 파싱시 items가 JSONObject / JSONArray 일수 있으므로 요청 성공시 body까지만 가져온다.
     **/
    public JsonObject getApiResultBody(ResponseEntity<String> apiResponse){

        JsonObject apiResultBody = new JsonObject();

        if (apiResponse.getStatusCode() == HttpStatus.OK) {
            JsonObject jsonObject = gson.fromJson(apiResponse.getBody(), JsonObject.class);
            jsonObject = jsonObject.getAsJsonObject("response");
            apiResultBody = jsonObject.getAsJsonObject("body");
        }

        return apiResultBody;
    }

    /**
     * makeFullURI(String apiURL)
     * data.go.kr API에 따라 URI로 만들 파라미터 세팅
     **/
    public String makeFullURI(String apiURL) throws UnsupportedEncodingException {

        /* URL */
        StringBuilder urlBuilder = new StringBuilder(apiURL);
        /* API service KEY */
        urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey);

        if(apiURL.contains("getUltraSrtFcst")){                         /* 초단기 날씨 예보 */

            Calendar calendar =  Calendar.getInstance();
            // 조회시엔 현재 시간 -30분
            calendar.add(Calendar.MINUTE, -30);
            Date date = new Date(calendar.getTimeInMillis());

            // 포맷 정의
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH");
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

            String baseDate = format.format(date);
            String baseTime = timeFormat.format(date) + "30";

            urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode(weatherNumOfRows, encoding));              // 페이지 번호
            urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode(pageNo, encoding));                           // 한 페이지 결과 수
            urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "=" + URLEncoder.encode(dataType, encoding));                       // 데이터 타입
            urlBuilder.append("&" + URLEncoder.encode("base_date", "UTF-8") + "=" + URLEncoder.encode(baseDate, encoding));                      // 날짜
            urlBuilder.append("&" + URLEncoder.encode("base_time", "UTF-8") + "=" + URLEncoder.encode(baseTime, encoding));                      // 시간
            urlBuilder.append("&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode(nx, encoding));                                   // x 좌표
            urlBuilder.append("&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode(ny, encoding));                                   // Y 좌표

        } else if(apiURL.contains("getAreaRiseSetInfo")) {              /* 일출,일몰 시간 */
            // 현재 날짜 구하기
            Date date = new Date();
            // 포맷 정의
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String locdate = format.format(date);

            urlBuilder.append("&" + URLEncoder.encode("location", "UTF-8") + "=" + URLEncoder.encode(sunsetSunriseApiLocation, encoding));       // 지역명
            urlBuilder.append("&" + URLEncoder.encode("locdate", "UTF-8") + "=" + URLEncoder.encode(locdate, encoding));                         // 날짜

        } else if(apiURL.contains("getMsrstnAcctoRltmMesureDnsty")){    /* 미세 먼지 */
            urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode(dataType, encoding));                      // 데이터 타입
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode(fineDustNumOfRows, encoding));              // 한 페이지 결과 수
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(pageNo, encoding));                            // 페이지 번호
            urlBuilder.append("&" + URLEncoder.encode("stationName","UTF-8") + "=" + URLEncoder.encode(fineDustStationName, encoding));          // 측정소 이름
            urlBuilder.append("&" + URLEncoder.encode("dataTerm","UTF-8") + "=" + URLEncoder.encode(fineDustDataTerm, encoding));                // 요청 데이터 기간
            urlBuilder.append("&" + URLEncoder.encode("ver","UTF-8") + "=" + URLEncoder.encode(fineDustVersion, encoding));                      // 버전별 상세 결과 참고

        }

        return urlBuilder.toString();
    }
}
