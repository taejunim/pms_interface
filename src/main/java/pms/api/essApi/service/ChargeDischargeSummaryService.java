package pms.api.essApi.service;

import org.springframework.stereotype.Service;
import pms.api.essApi.service.model.ChargeDischargeInsertData;
import pms.api.essApi.service.model.ChargeDischargeSummary;

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
     * ESS IDX 가져오기
     */
    public ChargeDischargeInsertData getEssIdx(ChargeDischargeSummary chargeDischargeSummary){
        return chargeDischargeSummaryMapper.getEssIdx(chargeDischargeSummary);
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

    /**
     * 하루 고정형 충전 Summary 등록
     */
    public void insertDayFixChargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insertDayFixChargeData(chargeDischargeInsertData);
    }

    /**
     * 하루 고정형 방전 Summary 등록
     */
    public void insertDayFixDischargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insertDayFixDischargeData(chargeDischargeInsertData);
    }

    /**
     * 하루 이동형 충전 Summary 등록
     */
    public void insertDayMobileChargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insertDayMobileChargeData(chargeDischargeInsertData);
    }

    /**
     * 하루 이동형 방전 Summary 등록
     */
    public void insertDayMobileDischargeData(ChargeDischargeInsertData chargeDischargeInsertData){
        chargeDischargeSummaryMapper.insertDayMobileDischargeData(chargeDischargeInsertData);
    }
}
