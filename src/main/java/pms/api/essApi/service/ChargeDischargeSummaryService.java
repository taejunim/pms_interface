package pms.api.essApi.service;

import org.springframework.stereotype.Service;
import pms.api.essApi.service.model.ChargeDischargeInsertData;

/**
 * ChargeDischargeSummaryService.java
 *
 * 충방전 Summary Service
 *
 * Created by Youyeong Jo on 2022/04/19.
 */
@Service
public class ChargeDischargeSummaryService {
    private final ChargeDischargeSummaryMapper chargeDischargeSummaryMapper;

    public ChargeDischargeSummaryService(ChargeDischargeSummaryMapper chargeDischargeSummaryMapper) {
        this.chargeDischargeSummaryMapper = chargeDischargeSummaryMapper;
    }

    /**
     * 15분 고정형 충전 Summary 등록
     */
    public void insert15FixChargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert15FixChargeData(chargeDischargeInsertData);
    }

    /**
     * 15분 고정형 방전 Summary 등록
     */
    public void insert15FixDischargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert15FixDischargeData(chargeDischargeInsertData);
    }

    /**
     * 15분 이동형 충전 Summary 등록
     */
    public void insert15MobileChargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert15MobileChargeData(chargeDischargeInsertData);
    }

    /**
     * 15분 이동형 방전 Summary 등록
     */
    public void insert15MobileDischargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert15MobileDischargeData(chargeDischargeInsertData);
    }

    /**
     * 한시간 고정형 충전 Summary 등록
     */
    public void insert60FixChargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert60FixChargeData(chargeDischargeInsertData);
    }

    /**
     * 한시간 고정형 방전 Summary 등록
     */
    public void insert60FixDischargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert60FixDischargeData(chargeDischargeInsertData);
    }

    /**
     * 한시간 이동형 충전 Summary 등록
     */
    public void insert60MobileChargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert60MobileChargeData(chargeDischargeInsertData);
    }

    /**
     * 한시간 이동형 방전 Summary 등록
     */
    public void insert60MobileDischargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insert60MobileDischargeData(chargeDischargeInsertData);
    }

}
