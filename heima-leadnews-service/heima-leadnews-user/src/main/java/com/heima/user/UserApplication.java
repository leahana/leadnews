package com.heima.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: LeahAna
 * @Date: 2022/7/1 23:45
 * @Desc: user-service启动类
 */
@Slf4j
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
        log.info("userApplication start!!!");
    }
}
