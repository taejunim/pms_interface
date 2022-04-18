package pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@PropertySource(value = "interface.properties", encoding = "UTF-8")
public class PmsInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsInterfaceApplication.class, args);
    }
}
