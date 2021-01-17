package com.yanzhen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yanzhen.dao")
public class RbasApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbasApplication.class, args);
    }

}
