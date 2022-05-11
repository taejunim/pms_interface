package pms.api.holidayInterface.service;

import org.springframework.stereotype.Service;
import pms.api.holidayInterface.service.model.HolidayInterface;
import java.util.List;
/**
 * HolidayInterfaceService.java
 *
 * 공휴일 정보 Service
 *
 * Created by Youyeong Jo on 2022/05/10.
 */
@Service
public class HolidayInterfaceService {

    private final HolidayInterfaceMapper holidayInterfaceMapper;

    public HolidayInterfaceService(HolidayInterfaceMapper holidayInterfaceMapper) {
        this.holidayInterfaceMapper = holidayInterfaceMapper;
    }

    /**
     * 공휴일 등록
     */
    public void insertHolidayData(List<HolidayInterface> holidayInterface) {
        holidayInterfaceMapper.insertHolidayData(holidayInterface);
    }


    /**
     * 해당 월 공휴일 데이터 삭제
     */
    public void deleteCurrentMonthHolidayData(HolidayInterface holidayInterface) {
        holidayInterfaceMapper.deleteCurrentMonthHolidayData(holidayInterface);
    }
}
