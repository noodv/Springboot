package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 详细信息
                .apiInfo(apiInfo())
                // 创建扫描类
                .select()
                // 当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
                // 路径过滤
                .paths(PathSelectors.any())
                // 构建
                .build();
    }

    // 构建api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("springBoot测试使用Swagger2构建RESTful API")
                // 创建人和官方网址
                .contact(new Contact("chendai", "http://www.baidu.com", ""))
                // 版本号
                .version("1.0")
                // 描述
                .description("API 描述").build();
    }

}