package com.bdqn.dao.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MyBatisMapperScannerConfig
 * Description:MyBatisMapper的核心配置（纯JAVA方式）
 * Author:
 * Date 2019/7/30 7:48
 */

@Configuration
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer =
                new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        配置mapper接口的位置
        mapperScannerConfigurer.setBasePackage("com.bdqn.dao");
        return mapperScannerConfigurer;
    }

}
