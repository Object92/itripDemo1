package com.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//通过JAVA的方式配置了MapperScanConfigure
//@MapperScan(basePackages = "com.bdqn.dao")
public class ItripbizApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItripbizApplication.class, args);
    }

}
