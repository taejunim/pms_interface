package pms.api.smpLimitCost.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.smpLimitCost.service.vo.SmpLimitCostVO;

import java.util.List;

/**
 * SmpLimitCostMapper.java
 *
 * SMP 한국 전력 거래소 계통 한계 가격 정보 Mapper
 *
 * Created by Youyeong Jo on 2022/09/27.
 */

@Mapper
@Repository
public interface SmpLimitCostMapper {

    /**
     * 당일 등록된 SMP 계통 한계 가격 정보 개수 조회
     *
     * @return
     */
    int selectTodaySmpLimitCostCount(String areaCd);

    /**
     * 오늘 계통 한계 가격 정보 insert
     *
     * @return
     */
    void insertSmpLimitCostData(List<SmpLimitCostVO> smpLimitCostVO);
}
