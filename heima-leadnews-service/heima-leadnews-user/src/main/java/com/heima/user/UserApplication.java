package com.heima.user;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: LeahAna
 * @Date: 2022/7/1 23:45
 * @Desc: user-service启动类
 */
@Slf4j
@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan("com.heima.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
        log.info("userApplication start!!!");
    }
}
