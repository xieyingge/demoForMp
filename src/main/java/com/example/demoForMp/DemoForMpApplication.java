package com.example.demoForMp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demoForMp.mapper")
public class DemoForMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoForMpApplication.class, args);
    }

}
