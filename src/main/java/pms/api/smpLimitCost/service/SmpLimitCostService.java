package pms.api.smpLimitCost.service;

import org.springframework.stereotype.Service;
import pms.api.smpLimitCost.service.vo.SmpLimitCostVO;

import java.util.List;

/**
 * SmpLimitCostService.java

 * SMP 한국 전력 거래소 계통 한계 가격 정보 Service
 *
 * Created by Youyeong Jo on 2022/09/27.
 */

@Service
public class SmpLimitCostService {

    private final SmpLimitCostMapper smpLimitCostMapper;

    public SmpLimitCostService(SmpLimitCostMapper smpLimitCostMapper) {
        this.smpLimitCostMapper = smpLimitCostMapper;
    }

    /**
     * 당일 등록된 SMP 계통 한계 가격 정보 개수 조회
     */
    public int selectTodaySmpLimitCostCount() {
        return smpLimitCostMapper.selectTodaySmpLimitCostCount();
    }

    /**
     * 오늘 계통 한계 가격 정보 insert
     */
    public void insertSmpLimitCostData(List<SmpLimitCostVO> smpLimitCostVO) {
        smpLimitCostMapper.insertSmpLimitCostData(smpLimitCostVO);
    }
}
