package pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import pms.api.common.PropertyEncryptDecrypt;
import pms.api.holiday.HolidayScheduler;

import java.net.URISyntaxException;

@SpringBootApplication
@EnableScheduling
@PropertySource(value = "classpath:interface.properties", encoding = "UTF-8")
public class PmsInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsInterfaceApplication.class, args);
    }

    //어플리케이션 준비 완료 후 해당 월의 공휴일 데이터를 갱신
    @EventListener(ApplicationReadyEvent.class)
    public void init() throws URISyntaxException {
        PropertyEncryptDecrypt.encryptProcess();
        //HolidayScheduler.insertHolidayData(true);
    }
}
