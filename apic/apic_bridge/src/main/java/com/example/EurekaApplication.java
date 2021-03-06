package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

//@EnableEurekaClient非必须使用
@SpringBootApplication
@EnableEurekaClient
public class EurekaApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
