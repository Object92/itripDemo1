package com.bdqn.biz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 *@ClassName:
 *@Description: TODO Soringboot读取配置文件信息
 *@Author:lzq
 *@Date: 2019/9/23 12:12
 **/
@Configuration
@ConfigurationProperties(prefix = "test")
public class TestConfig {

//    @Value("${test.age}")
    private int age;
//    @Value("${test.name}")
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
