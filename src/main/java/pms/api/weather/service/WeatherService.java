package pms.api.weather.service;

import org.springframework.stereotype.Service;
import pms.api.weather.service.vo.WeatherVO;

/**
 * WeatherService.java
 *
 * 날씨 정보 Service
 *
 * Created by Youyeong Jo on 2022/04/15.
 */

@Service
public class WeatherService {
    private final WeatherMapper weatherMapper;

    public WeatherService(WeatherMapper weatherMapper) {
        this.weatherMapper = weatherMapper;
    }

    /**
     * 날씨정보 등록
     */
    public void insertWeatherData(WeatherVO weatherVO) {
        weatherMapper.insertWeatherData(weatherVO);
    }

}
