package pms.api.essApi.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.essApi.service.vo.ChargeDischargeInsertVO;
import pms.api.essApi.service.vo.ChargeDischargeSummaryVO;

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
    ChargeDischargeInsertVO getEssIdx(ChargeDischargeSummaryVO chargeDischargeSummaryVO);

    /**
     * 15분 고정형 충전 Summary 등록
     */
    void insert15FixChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 15분 고정형 방전 Summary 등록
     */
    void insert15FixDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 15분 이동형 충전 Summary 등록
     */
    void insert15MobileChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 15분 이동형 방전 Summary 등록
     */
    void insert15MobileDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 한시간 고정형 충전 Summary 등록
     */
    void insert60FixChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 한시간 고정형 방전 Summary 등록
     */
    void insert60FixDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 한시간 이동형 충전 Summary 등록
     */
    void insert60MobileChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 한시간 이동형 방전 Summary 등록
     */
    void insert60MobileDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 하루 고정형 충전 Summary 등록
     */
    void insertDayFixChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 하루 고정형 방전 Summary 등록
     */
    void insertDayFixDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 하루 이동형 충전 Summary 등록
     */
    void insertDayMobileChargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);

    /**
     * 하루 이동형 방전 Summary 등록
     */
    void insertDayMobileDischargeData(ChargeDischargeInsertVO chargeDischargeInsertVO);
}
