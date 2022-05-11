package pms.api.holidayInterface.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.holidayInterface.service.model.HolidayInterface;

import java.util.List;
/**
 * HolidayInterfaceMapper.java
 *
 * 공휴일 정보 Mapper
 *
 * Created by Youyeong Jo on 2022/05/10.
 */
@Mapper
@Repository
public interface HolidayInterfaceMapper {

    /**
     * 공휴일 정보 등록
     *
     * @return
     */
    void insertHolidayData(List<HolidayInterface> holidayInterface);

    /**
     * 해당 월 공휴일 데이터 삭제
     *
     * @return
     */
    void deleteCurrentMonthHolidayData(HolidayInterface holidayInterface);
}
