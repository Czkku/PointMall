package com.example.businessservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.example.businessservice.mapper")
public class BusinessserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessserviceApplication.class, args);
    }

}
