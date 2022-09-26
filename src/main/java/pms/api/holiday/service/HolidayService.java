package pms.api.holiday.service;

import org.springframework.stereotype.Service;
import pms.api.holiday.service.vo.HolidayVO;
import java.util.List;
/**
 * HolidayService.java
 *
 * 공휴일 정보 Service
 *
 * Created by Youyeong Jo on 2022/05/10.
 */
@Service
public class HolidayService {

    private final HolidayMapper holidayMapper;

    public HolidayService(HolidayMapper holidayMapper) {
        this.holidayMapper = holidayMapper;
    }

    /**
     * 공휴일 등록
     */
    public void insertHolidayData(List<HolidayVO> holidayVO) {
        holidayMapper.insertHolidayData(holidayVO);
    }


    /**
     * 해당 월 공휴일 데이터 삭제
     */
    public void deleteCurrentMonthHolidayData(HolidayVO holidayVO) {
        holidayMapper.deleteCurrentMonthHolidayData(holidayVO);
    }
}
