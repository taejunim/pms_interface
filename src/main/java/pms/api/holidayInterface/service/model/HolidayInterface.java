package pms.api.holidayInterface.service.model;

import lombok.Getter;
import lombok.Setter;

/**
 * HolidayInterface.java
 *
 * 공휴일 정보
 *
 * Created by Youyeong Jo on 2022/05/10.
 */

@Getter
@Setter
public class HolidayInterface {

    private String locdate;             //공휴일 일자
    private String dateName;            //휴일명
    private String isHoliday;           //휴무 여부

    private String searchStart;         //검색 조건 시작 연월
    private String searchEnd;           //검색 조건 끝 연월
}
