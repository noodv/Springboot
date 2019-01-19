package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//界面访问地址 http://localhost:8009/swagger-ui.html#/swagger-controller
@SpringBootApplication
public class AppSwagger
{

    public static void main(String[] args)
    {
        SpringApplication.run(AppSwagger.class, args);
    }

}
