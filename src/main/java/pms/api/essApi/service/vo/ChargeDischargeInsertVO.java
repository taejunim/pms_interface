package pms.api.essApi.service.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * ChargeDischargeInsertVO.java
 *
 * 충방전 Summary Insert용 Data
 *
 * Created by Youyeong Jo on 2022/04/19.
 */
@Getter
@Setter
public class ChargeDischargeInsertVO {

    private String essIdx;                   //ESS IDX (레플러스에서 관리하는 ID)
    private String essEquipId;               //ESS ID (메티스 PMS에서 관리하는 ID)
    private String meteringDate;             //검침 날짜 yyyymmdd
    private String meteringTime;             //검침 시간 HH / HHmm
    private String chargeDischargeAmount;    //충/방전량
    private String accumulateAmount;         //누적 충/방전량
}
