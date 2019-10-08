package com.bdqn.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *@ClassName:
 *@Description: TODO 认证模块的启动类
 *@Author:lzq
 *@Date: 2019/9/24 10:27
 **/
@SpringBootApplication(scanBasePackages = "com.bdqn")
public class Itripauth {
    public static void main(String[] args) {
        SpringApplication.run(Itripauth.class,args);
    }
}
