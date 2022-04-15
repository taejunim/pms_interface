package pms.api.model.weatherInterface;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * WeatherInterface.java
 *
 * ESS 정보
 *
 * Created by Youyeong Jo on 2022/94/15.
 */

@Getter
@Setter
public class WeatherInterface {
    @Schema(name = "regDt", description = "등록일자", example = "2022-04-14 20:21:00")
    private String regDt;
    @Schema(name = "baseDate", description = "예보일자", example = "20220415")
    private String baseDate;
    @Schema(name = "baseTime", description = "예보시간", example = "2000")
    private String baseTime;
    @Schema(name = "nx", description = "지역 코드 x", example = "53")
    private int nx;
    @Schema(name = "ny", description = "지역 코드 y", example = "38")
    private int ny;
    @Schema(name = "sky", description = "하늘 상태", example = "4")
    private int sky;
    @Schema(name = "temp", description = "온도", example = "12")
    private int temp;
    @Schema(name = "reh", description = "습도", example = "75")
    private String reh;
    @Schema(name = "rn1", description = "1시간 강수량", example = "0")
    private int rn1;
    @Schema(name = "wsd", description = "풍속", example = "4")
    private String wsd;
    @Schema(name = "sunrise", description = "일출 시간", example = "06:04")
    private String sunrise;
    @Schema(name = "sunset", description = "일몰 시간", example = "19:04")
    private String sunset;
    @Schema(name = "pm10", description = "미세 먼지 (pm10)", example = "36")
    private String pm10;
}
