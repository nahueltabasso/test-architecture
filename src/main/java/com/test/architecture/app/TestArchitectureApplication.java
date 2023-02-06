package com.test.architecture.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = {
        "nrt.common.microservice.exceptions",
        "com.test.architecture.app",
        "nrt.common.microservice.config"})
@SpringBootApplication
public class TestArchitectureApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestArchitectureApplication.class, args);
    }

}
