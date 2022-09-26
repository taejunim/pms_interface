package pms.api.holiday.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.holiday.service.vo.HolidayVO;

import java.util.List;
/**
 * HolidayMapper.java
 *
 * 공휴일 정보 Mapper
 *
 * Created by Youyeong Jo on 2022/05/10.
 */
@Mapper
@Repository
public interface HolidayMapper {

    /**
     * 공휴일 정보 등록
     *
     * @return
     */
    void insertHolidayData(List<HolidayVO> holidayVO);

    /**
     * 해당 월 공휴일 데이터 삭제
     *
     * @return
     */
    void deleteCurrentMonthHolidayData(HolidayVO holidayVO);
}
