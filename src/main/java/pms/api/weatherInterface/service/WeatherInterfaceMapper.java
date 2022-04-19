package pms.api.weatherInterface.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pms.api.weatherInterface.service.model.WeatherInterface;

/**
 * WeatherInterfaceMapper.java
 *
 * 날씨 정보 Mapper
 *
 * Created by Youyeong Jo on 2022/04/15.
 */

@Mapper
@Repository
public interface WeatherInterfaceMapper {

    /**
     * 날씨 정보 등록
     *
     * @return
     */
    void insertWeatherData(WeatherInterface weatherInterface);

}
