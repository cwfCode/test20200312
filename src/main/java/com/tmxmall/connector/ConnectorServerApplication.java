package com.tmxmall.connector;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.tmxmall.files.dal.mapper")
@ComponentScan("com.tmxmall.connector.*")
@SpringBootApplication
public class ConnectorServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectorServerApplication.class, args);
    }

}
