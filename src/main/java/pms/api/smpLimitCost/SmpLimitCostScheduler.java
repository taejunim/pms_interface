package pms.api.smpLimitCost;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import org.json.XML;
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
import pms.api.smpLimitCost.service.SmpLimitCostService;
import pms.api.smpLimitCost.service.vo.SmpLimitCostVO;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * smpLimitCostScheduler.java
 *
 * SMP 한국 전력 거래소 계통 한계 가격 정보 Scheduler
 *
 * Created by Youyeong Jo on 2022/09/27.
 */
@Component
public class SmpLimitCostScheduler {

    //로그 설정
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final SmpLimitCostService smpLimitCostService;

    public SmpLimitCostScheduler(SmpLimitCostService smpLimitCostService) {
        this.smpLimitCostService = smpLimitCostService;
    }

    @Autowired
    private RestTemplate restTemplate = new RestTemplate();

    public Gson gson = new Gson();

    //data.go.kr 인증키
    @Value("${data.api.serviceKey}")
    private String serviceKey;
    //SMP 한국 전력 거래소 계통 한계 가격 조회 URL
    @Value("${smpLimitCost.api.url}")
    private String smpLimitCostApiUrl;
    //SMP 한국 전력 거래소 계통 한계 가격 지역 코드 (육지 : 1, 제주 : 9)
    @Value("${smpLimitCost.api.code}")
    private List<String> codeList;

    /**
     * saveSmpLimitCostData()
     * 전력 거래소 SMP 계통 한계 가격 조회 후 저장
     **/
    @Scheduled(cron = "30 0 0/1 * * *")
    public void saveSmpLimitCostData() {

        for(int i = 0; i < codeList.size(); i ++) {
            if (smpLimitCostService.selectTodaySmpLimitCostCount(codeList.get(i)) == 0) {
                logger.debug("==== 한국 전력 거래소 계통 한계 가격 정보 Scheduler 실행. areaCd : " + codeList.get(i) + " ====");

                final HttpEntity entity = new HttpEntity(new HttpHeaders());

                try {
                    String fullSmpLimitCostApiUrl = smpLimitCostApiUrl + "?serviceKey=" + serviceKey + "&areaCd=" + codeList.get(i);
                    URI smpLimitCostURI = new URI(fullSmpLimitCostApiUrl);
                    ResponseEntity<String> smpLimitCostApiResponse = restTemplate.exchange(smpLimitCostURI, HttpMethod.GET, entity, String.class);

                    if (smpLimitCostApiResponse.getStatusCode().equals(HttpStatus.OK)) {
                        //데이터 파싱용 Type 설정
                        Type listType = new TypeToken<ArrayList<SmpLimitCostVO>>() {
                        }.getType();
                        String response = smpLimitCostApiResponse.getBody();

                        JsonObject jsonObject = gson.fromJson(String.valueOf(XML.toJSONObject(response)), JsonObject.class);
                        jsonObject = jsonObject.getAsJsonObject("response");
                        jsonObject = jsonObject.getAsJsonObject("body");
                        jsonObject = jsonObject.getAsJsonObject("items");

                        List<SmpLimitCostVO> apiResultBody = gson.fromJson(jsonObject.get("item").toString(), listType);
                        smpLimitCostService.insertSmpLimitCostData(apiResultBody);
                        logger.debug("==== 한국 전력 거래소 계통 한계 가격 정보 호출 성공. areaCd : " + codeList.get(i) + " ====");
                    }

                } catch (HttpServerErrorException e) {
                    logger.error("한국 전력 거래소 계통 한계 가격 정보 수신 실패. 한국 전력 거래소 계통 한계 가격 정보 API 호출을 재시도 합니다. areaCd : " + codeList.get(i));
                    logger.error(e.getLocalizedMessage());
                } catch (ResourceAccessException e) {
                    logger.error("한국 전력 거래소 계통 한계 가격 정보 호출시 TimeOut 발생. 한국 전력 거래소 계통 한계 가격 정보 API 호출을 재시도 합니다. areaCd : " + codeList.get(i));
                    logger.error(e.getLocalizedMessage());
                } catch (JsonSyntaxException | ClassCastException e) {
                    logger.error("customerApiResponseBody - 한국 전력 거래소 계통 한계 가격 정보 데이터 JsonSyntaxException | ClassCastException. 한국 전력 거래소 계통 한계 가격 정보 API 호출을 재시도 합니다. areaCd : " + codeList.get(i));
                    logger.error(e.getLocalizedMessage());
                } catch (Exception e) {
                    logger.error("한국 전력 거래소 계통 한계 가격 정보 데이터 Exception 발생. 한국 전력 거래소 계통 한계 가격 정보 API 호출을 재시도 합니다. areaCd : " + codeList.get(i));
                    logger.error(e.getLocalizedMessage());
                }
            } else logger.debug("==== 해당 날짜에 한국 전력 거래소 계통 한계 가격 정보 존재. areaCd : " + codeList.get(i) + " ====");
        }
    }
}
