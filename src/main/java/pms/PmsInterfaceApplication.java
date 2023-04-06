package pms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import pms.api.common.PropertyEncryptDecrypt;
import pms.api.dr.DrConfig;
import pms.api.dr.openadr.OadrHttpClient20b;
import pms.api.dr.service.DrService;
import pms.api.dr.service.vo.DrBaseVO;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableScheduling
@PropertySource(value = "classpath:interface.properties", encoding = "UTF-8")
public class PmsInterfaceApplication {
    @Autowired
    DrService drService;
    public OadrHttpClient20b oadrHttpClient = new DrConfig().initOadrHttpClient20b();
    public DrBaseVO drBaseVO = new DrBaseVO(); //등록된 DR 정보 가져오기
    public String drVenId; //통신을 위한 VEN 아이디
    public List<String> rIdList = new ArrayList<>(); //DR 참여중인 한전고객번호 리스트

    public static void main(String[] args) {
        SpringApplication.run(PmsInterfaceApplication.class, args);
    }

    //어플리케이션 준비 완료 후 해당 월의 공휴일 데이터를 갱신
    @EventListener(ApplicationReadyEvent.class)
    public void init() throws URISyntaxException {
        PropertyEncryptDecrypt.encryptProcess();
        //HolidayScheduler.insertHolidayData(true);

        try {
            drBaseVO = drService.selectDrBase();
            drVenId = drBaseVO.getDrVenId();

            rIdList = drService.selectRId();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
