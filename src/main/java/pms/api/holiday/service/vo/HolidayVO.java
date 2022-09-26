package pms.api.holiday.service.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * HolidayVO.java
 *
 * 공휴일 정보 VO
 *
 * Created by Youyeong Jo on 2022/05/10.
 */

@Getter
@Setter
public class HolidayVO {

    private String locdate;             //공휴일 일자
    private String dateName;            //휴일명
    private String isHoliday;           //휴무 여부

    private String searchStart;         //검색 조건 시작 연월
    private String searchEnd;           //검색 조건 끝 연월
}
