package pms.api.weatherInterface.service;

import org.springframework.stereotype.Service;
import pms.api.weatherInterface.service.model.WeatherInterface;

/**
 * WeatherInterfaceService.java
 *
 * 날씨 정보 Service
 *
 * Created by Youyeong Jo on 2022/04/15.
 */

@Service
public class WeatherInterfaceService {
    private final WeatherInterfaceMapper weatherInterfaceMapper;

    public WeatherInterfaceService(WeatherInterfaceMapper weatherInterfaceMapper) {
        this.weatherInterfaceMapper = weatherInterfaceMapper;
    }

    /**
     * 날씨정보 등록
     */
    public void insertWeatherData(WeatherInterface weatherInterface) {
        weatherInterfaceMapper.insertWeatherData(weatherInterface);
    }

}
