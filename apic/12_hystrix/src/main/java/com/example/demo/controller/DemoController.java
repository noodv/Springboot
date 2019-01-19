package com.example.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController
{

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getOffer")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String getOffer()
    {
        String str = restTemplate.getForObject("http://service-2/getOffer", String.class);
        return str;
    }

    public String helloFallback (){
        return "error";
    }

}
