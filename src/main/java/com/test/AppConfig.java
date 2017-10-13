package com.test;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/8/30.
 */
@SpringBootApplication
@MapperScan("com.test.mapper")
public class AppConfig {
    public static void main(String[] args){
        SpringApplication.run(AppConfig.class);
    }
}
