package com.bdqn.biz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@ClassName:
 *@Description: TODO swagger 在线接口文档配置类
 *@Author:lzq
 *@Date: 2019/9/23 9:27
 **/
@EnableSwagger2
@ComponentScan(value = "com.bdqn.biz.controller")
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
//				.globalOperationParameters(operationParameters)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该Api的基本信息（这些基本信息会展现在文档页面中）
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱旅行-主页物模块API")
                .termsOfServiceUrl("http://127.0.0.1:8083/itripbiz")
                .contact("yao.szb@bdqn.cn")
                .version("1.0")
                .build();
    }
}
