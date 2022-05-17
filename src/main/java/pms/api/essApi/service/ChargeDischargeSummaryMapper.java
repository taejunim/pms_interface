package pms.api.essApi.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.essApi.service.model.ChargeDischargeInsertData;
import pms.api.essApi.service.model.ChargeDischargeSummary;

/**
 * ChargeDischargeSummaryMapper.java
 *
 * 충방전 Summary Mapper
 *
 * Created by Youyeong Jo on 2022/04/19.
 */
@Mapper
@Repository
public interface ChargeDischargeSummaryMapper {

    /**
     * ESS IDX 가져오기
     */
    ChargeDischargeInsertData getEssIdx(ChargeDischargeSummary chargeDischargeSummary);

    /**
     * 15분 고정형 충전 Summary 등록
     */
    void insert15FixChargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 15분 고정형 방전 Summary 등록
     */
    void insert15FixDischargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 15분 이동형 충전 Summary 등록
     */
    void insert15MobileChargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 15분 이동형 방전 Summary 등록
     */
    void insert15MobileDischargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 한시간 고정형 충전 Summary 등록
     */
    void insert60FixChargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 한시간 고정형 방전 Summary 등록
     */
    void insert60FixDischargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 한시간 이동형 충전 Summary 등록
     */
    void insert60MobileChargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 한시간 이동형 방전 Summary 등록
     */
    void insert60MobileDischargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 하루 고정형 충전 Summary 등록
     */
    void insertDayFixChargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 하루 고정형 방전 Summary 등록
     */
    void insertDayFixDischargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 하루 이동형 충전 Summary 등록
     */
    void insertDayMobileChargeData(ChargeDischargeInsertData chargeDischargeInsertData);

    /**
     * 하루 이동형 방전 Summary 등록
     */
    void insertDayMobileDischargeData(ChargeDischargeInsertData chargeDischargeInsertData);
}
