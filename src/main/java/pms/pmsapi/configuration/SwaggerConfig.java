package pms.pmsapi.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI pmsOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("PMS API")   //API 타이틀
                        .description("Power Management System API") //API 설명
                        .version("v1.0.0")  //API 버전
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")
                        )
                )
                .externalDocs(new ExternalDocumentation()
                        .description("PMS API Documentation")
                        .url("https://springshop.wiki.github.org/docs")
                );

    }
}
