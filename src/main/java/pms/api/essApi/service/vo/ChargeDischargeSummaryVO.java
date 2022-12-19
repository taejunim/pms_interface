package pms.api.essApi.service.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * ChargeDischargeSummaryVO.java
 *
 * 충방전 Summary VO (parameter)
 *
 * Created by Youyeong Jo on 2022/04/19.
 */
@Getter
@Setter
public class ChargeDischargeSummaryVO {

    @Schema(name = "essEquipId", description = "ESS ID", example = "E001")
    private String essEquipId;
    @Schema(name = "meteringDt", description = "검침 일시 - unixTimeStamp", example = "1649749800")
    private String meteringDt;
    @Schema(name = "chargeDischargeAmount", description = "충/방전량", example = "0")
    private String chargeDischargeAmount;
    @Schema(name = "accumulateAmount", description = "누적 충/방전량", example = "0")
    private String accumulateAmount;
    @Schema(name = "chargeType", description = "충/방전 타입 chg / dis", example = "chg")
    private String chargeType;
    @Schema(name = "positionFixYn", description = "고정형/이동형 구분 Y / N", example = "Y")
    private String positionFixYn;
    @Schema(name = "periodType", description = "기간(15분/60분/하루) 구분 (15/60/24H)", example = "15")
    private String periodType;
}