package com.admin.encanta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class EncantaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EncantaApplication.class, args);
    }

}
