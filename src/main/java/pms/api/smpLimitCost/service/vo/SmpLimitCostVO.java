package pms.api.smpLimitCost.service.vo;

import lombok.Data;

/**
 * SmpLimitCostVO.java
 *
 * SMP 한국 전력 거래소 계통 한계 가격 정보 VO
 *
 * Created by Youyeong Jo on 2022/09/27.
 */
@Data
public class SmpLimitCostVO {

    private String tradeDay;
    private String tradeHour;
    private String areaCd;
    private String smp;
}
