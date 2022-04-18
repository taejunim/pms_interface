package pms.api.weatherInterface;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pms.api.weatherInterface.model.WeatherInterface;
import pms.api.weatherInterface.service.WeatherInterfaceService;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Component
public class WeatherInterfaceScheduler {

    private final pms.api.weatherInterface.service.WeatherInterfaceService WeatherInterfaceService;

    public WeatherInterfaceScheduler(WeatherInterfaceService weatherInterfaceService) {
        this.WeatherInterfaceService = weatherInterfaceService;
    }

    //초단기 예보 API URL
    public String weatherForecastApiUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst";
    //일몰 일출 API URL
    public String sunriseSunsetApiUrl = "http://apis.data.go.kr/B090041/openapi/service/RiseSetInfoService/getAreaRiseSetInfo";
    //미세먼지 API URL
    public String fineDustApiUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
    //data.go.kr 인증키
    public String serviceKey = "aDVsltIrJTOtDLpTA6qnVPhVhaT%2FaciIUGI30aiipGikIAAZOI4KxfVFBqW9q3s%2B3xgVzKx6c3gJdUVGaNJ9Bg%3D%3D";
    //공공데이터포탈 응답 형식
    public String dataType ="JSON";
    //페이지 번호
    public String pageNo = "1";
    //페이지 결과 수 - 날씨
    public String weatherNumOfRows = "60";
    //페이지 결과 수 - 미세먼지
    public String fineDustNumOfRows = "1";

    //초단기 예보 지역 코드 - 제주
    public String nx = "53";
    //초단기 예보 지역 코드 - 제주
    public String ny = "38";
    //일몰 일출 API 지역
    public String sunsetSunriseApiLocation = "제주";
    //미세 먼지 API 측정소
    public String fineDustStationName = "이도동";

    public Gson gson = new Gson();

    @Scheduled(cron="0 10 0/1 * * *" )
    public void getWeatherData() throws URISyntaxException, UnsupportedEncodingException {

        RestTemplate restTemplate = new RestTemplate();
        final HttpEntity entity = new HttpEntity(new HttpHeaders());

        WeatherInterface weatherInterface = new WeatherInterface();

        /* 초단기 예보 데이터 START */
        URI weatherResponseURI = new URI(makeFullURI(weatherForecastApiUrl));
        System.out.println("초단계 예보 데이터 URI --> " + weatherResponseURI);
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

            JsonObject weatherResult = getApiResultBody(weatherApiResponse);
            System.out.println("초단계 예보 데이터 body");
            System.out.println(weatherResult);
            if (weatherResult.size() > 0) {
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
        } catch (JsonSyntaxException e){
            System.out.println("weatherApiResponse - 초단기 예보 데이터 응답 이상");
            System.out.println(weatherApiResponse);
        }
        /* 초단기 예보 데이터 END */
        /* 일출,일몰 데이터 START */
        URI sunsetSunriseResponseURI = new URI(makeFullURI(sunriseSunsetApiUrl));
        System.out.println("일몰 일출 데이터 URI --> " + sunsetSunriseResponseURI);
        ResponseEntity<String> sunriseSunsetApiResponse = restTemplate.exchange(sunsetSunriseResponseURI, HttpMethod.GET, entity, String.class);
        try {
            JsonObject sunriseSunsetResult = getApiResultBody(sunriseSunsetApiResponse);
            System.out.println("일몰일출 데이터 body");
            System.out.println(sunriseSunsetResult);
            if (sunriseSunsetResult.size() > 0) {
                JsonObject items = (JsonObject) sunriseSunsetResult.get("items");
                if (items.size() > 0) {
                    JsonObject item = items.getAsJsonObject("item");
                    String sunrise = item.get("sunrise").toString();
                    String sunset = item.get("sunset").toString();
                    weatherInterface.setSunrise(sunrise.substring(1, 3) + ":" + sunrise.substring(3, 5));
                    weatherInterface.setSunset(sunset.substring(1, 3) + ":" + sunset.substring(3, 5));
                }
            }
        } catch (JsonSyntaxException e){
            System.out.println("sunriseSunsetApiResponse - 일몰 일출 데이터 응답 이상");
            System.out.println(sunriseSunsetApiResponse);
        }
        /* 일출,일몰 데이터 END */
        /* 미세 먼지 데이터 START */
        URI fineDustResponseURI = new URI(makeFullURI(fineDustApiUrl));
        System.out.println("미세먼지 데이터 URI --> " + fineDustResponseURI);
        ResponseEntity<String> fineDustApiResponse = restTemplate.exchange(fineDustResponseURI, HttpMethod.GET, entity, String.class);
        try {
            JsonObject fineDustResult = getApiResultBody(fineDustApiResponse);
            System.out.println("미세먼지 데이터 body");
            System.out.println(fineDustResult);
            if (fineDustResult.size() > 0) {
                JsonArray items = (JsonArray) fineDustResult.get("items");
                if (items.size() > 0) {
                    JsonObject item = (JsonObject) items.get(0);
                    weatherInterface.setPm10(item.get("pm10Flag").isJsonNull() ? item.get("pm10Value").toString().replace("\"", "") : "");
                }
            }
        } catch (JsonSyntaxException e){
            System.out.println("fineDustApiResponse - 미세 먼지 데이터 응답 이상");
            System.out.println(fineDustApiResponse);
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

            urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode(weatherNumOfRows, "UTF-8"));              // 페이지 번호
            urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode(pageNo, "UTF-8"));                           // 한 페이지 결과 수
            urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "=" + URLEncoder.encode(dataType, "UTF-8"));                       // 데이터 타입
            urlBuilder.append("&" + URLEncoder.encode("base_date", "UTF-8") + "=" + URLEncoder.encode(baseDate, "UTF-8"));                      // 날짜
            urlBuilder.append("&" + URLEncoder.encode("base_time", "UTF-8") + "=" + URLEncoder.encode(baseTime, "UTF-8"));                      // 시간
            urlBuilder.append("&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode(nx, "UTF-8"));                                   // x 좌표
            urlBuilder.append("&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode(ny, "UTF-8"));                                   // Y 좌표

        } else if(apiURL.contains("getAreaRiseSetInfo")) {              /* 일출,일몰 시간 */
            // 현재 날짜 구하기
            Date date = new Date();
            // 포맷 정의
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            String locdate = format.format(date);

            urlBuilder.append("&" + URLEncoder.encode("location", "UTF-8") + "=" + URLEncoder.encode(sunsetSunriseApiLocation, "UTF-8"));       // 지역명
            urlBuilder.append("&" + URLEncoder.encode("locdate", "UTF-8") + "=" + URLEncoder.encode(locdate, "UTF-8"));                         // 날짜

        } else if(apiURL.contains("getMsrstnAcctoRltmMesureDnsty")){    /* 미세 먼지 */
            urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode(dataType, "UTF-8"));                      // 데이터 타입
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode(fineDustNumOfRows, "UTF-8"));              // 한 페이지 결과 수
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(pageNo, "UTF-8"));                            // 페이지 번호
            urlBuilder.append("&" + URLEncoder.encode("stationName","UTF-8") + "=" + URLEncoder.encode(fineDustStationName, "UTF-8"));                    // 측정소 이름
            urlBuilder.append("&" + URLEncoder.encode("dataTerm","UTF-8") + "=" + URLEncoder.encode("DAILY", "UTF-8"));                      // 요청 데이터기간
            urlBuilder.append("&" + URLEncoder.encode("ver","UTF-8") + "=" + URLEncoder.encode("1.0", "UTF-8"));                             // 버전별 상세 결과 참고

        }

        return urlBuilder.toString();
    }
}
