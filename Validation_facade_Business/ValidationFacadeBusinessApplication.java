package com.Validation_facade_Busness.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ValidationFacadeBusnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidationFacadeBusnessApplication.class, args);
    }
}

