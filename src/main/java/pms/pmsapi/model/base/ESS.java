package pms.pmsapi.model.base;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * ESS.java
 *
 * ESS 정보
 *
 * Created by Ki-Jeong Kang on 2022/03/29.
 */

@Getter
@Setter
public class ESS {
    @Schema(name = "essCode", description = "ESS 코드", example = "E001")
    private String essCode;
    @Schema(name = "pmsCode", description = "PMS 코드", example = "P001")
    private String pmsCode;
    @Schema(name = "buildPositionCode", description = "거점 코드", example = "001")
    private String buildPositionCode;
    @Schema(name = "buildPositionOrder", description = "거점 순번", example = "1")
    private String buildPositionOrder;
    @Schema(name = "latitude", description = "위도", example = "37.3827")
    private double latitude;
    @Schema(name = "longitude", description = "경도", example = "127.119")
    private double longitude;
    @Schema(name = "positionFixYn", description = "ESS 고정여부", example = "Y")
    private String positionFixYn;
    @Schema(name = "targetElec", description = "목표 전력", example = "50.5")
    private String targetElec;
    @Schema(name = "batteryRemainElec", description = "배터리 총 용량", example = "100")
    private String batteryRemainElec;
}
