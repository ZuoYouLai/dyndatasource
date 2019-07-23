package com.example.dyndatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableScheduling
@EnableTransactionManagement
@Slf4j
@MapperScan("com.example.dyndatasource.mapper")
@EnableCaching
public class DyndatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DyndatasourceApplication.class, args);
    }

}
