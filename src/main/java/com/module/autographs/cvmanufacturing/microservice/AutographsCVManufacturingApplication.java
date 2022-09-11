package com.module.autographs.cvmanufacturing.microservice;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AutographsCVManufacturingApplication {

    private static final Logger logger = LogManager.getLogger(AutographsCVManufacturingApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(AutographsCVManufacturingApplication.class, args);
        logger.info("Autographs CV Manufacturing Microservices");

    }

    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI().info(apiInfo());
    }

    public Info apiInfo() {
        Info info = new Info();
        info.title("Autograph CV Manufacturing Microservices API").description("Live Code System Swagger Open API").version("v1.0.0");
        return info;
    }

}
