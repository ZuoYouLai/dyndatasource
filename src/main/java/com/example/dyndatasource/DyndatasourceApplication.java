package com.example.dyndatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.example.dyndatasource.mapper")
public class DyndatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DyndatasourceApplication.class, args);
    }

}
