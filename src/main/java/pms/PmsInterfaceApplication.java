package pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PmsInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmsInterfaceApplication.class, args);
    }
}
