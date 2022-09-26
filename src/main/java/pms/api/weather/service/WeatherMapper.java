package pms.api.weather.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.weather.service.vo.WeatherVO;

/**
 * WeatherMapper.java
 *
 * 날씨 정보 Mapper
 *
 * Created by Youyeong Jo on 2022/04/15.
 */

@Mapper
@Repository
public interface WeatherMapper {

    /**
     * 날씨 정보 등록
     *
     * @return
     */
    void insertWeatherData(WeatherVO weatherVO);

}
