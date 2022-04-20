package pms.api.essApi.service.model;

import lombok.Getter;
import lombok.Setter;

/**
 * ChargeDischargeInsertData.java
 *
 * 충방전 Summary Insert용 Data
 *
 * Created by Youyeong Jo on 2022/04/19.
 */
@Getter
@Setter
public class ChargeDischargeInsertData {


    private String essEquipId;               //ESS ID
    private String meteringDate;             //검침 날짜 yyyymmdd
    private String meteringTime;             //검침 시간 HH / HHmm
    private String chargeDischargeAmount;    //충/방전량
}
