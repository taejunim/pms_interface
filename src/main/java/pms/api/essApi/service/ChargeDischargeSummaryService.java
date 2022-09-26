package pms.api.essApi.service;

import org.springframework.stereotype.Service;
import pms.api.essApi.service.vo.ChargeDischargeInsertVO;
import pms.api.essApi.service.vo.ChargeDischargeSummaryVO;

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
    public ChargeDischargeInsertVO getEssIdx(ChargeDischargeSummaryVO chargeDischargeSummaryVO){
        return chargeDischargeSummaryMapper.getEssIdx(chargeDischargeSummaryVO);
    }

    /**
     * 15분 고정형 충전 Summary 등록
     */
    public void insert15FixChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert15FixChargeData(chargeDischargeInsertVO);
    }

    /**
     * 15분 고정형 방전 Summary 등록
     */
    public void insert15FixDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert15FixDischargeData(chargeDischargeInsertVO);
    }

    /**
     * 15분 이동형 충전 Summary 등록
     */
    public void insert15MobileChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert15MobileChargeData(chargeDischargeInsertVO);
    }

    /**
     * 15분 이동형 방전 Summary 등록
     */
    public void insert15MobileDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert15MobileDischargeData(chargeDischargeInsertVO);
    }

    /**
     * 한시간 고정형 충전 Summary 등록
     */
    public void insert60FixChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert60FixChargeData(chargeDischargeInsertVO);
    }

    /**
     * 한시간 고정형 방전 Summary 등록
     */
    public void insert60FixDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert60FixDischargeData(chargeDischargeInsertVO);
    }

    /**
     * 한시간 이동형 충전 Summary 등록
     */
    public void insert60MobileChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert60MobileChargeData(chargeDischargeInsertVO);
    }

    /**
     * 한시간 이동형 방전 Summary 등록
     */
    public void insert60MobileDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insert60MobileDischargeData(chargeDischargeInsertVO);
    }

    /**
     * 하루 고정형 충전 Summary 등록
     */
    public void insertDayFixChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insertDayFixChargeData(chargeDischargeInsertVO);
    }

    /**
     * 하루 고정형 방전 Summary 등록
     */
    public void insertDayFixDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insertDayFixDischargeData(chargeDischargeInsertVO);
    }

    /**
     * 하루 이동형 충전 Summary 등록
     */
    public void insertDayMobileChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insertDayMobileChargeData(chargeDischargeInsertVO);
    }

    /**
     * 하루 이동형 방전 Summary 등록
     */
    public void insertDayMobileDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO){
        chargeDischargeSummaryMapper.insertDayMobileDischargeData(chargeDischargeInsertVO);
    }
}
