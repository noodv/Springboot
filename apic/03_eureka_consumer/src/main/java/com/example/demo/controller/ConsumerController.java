package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController
{

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getData")
    public String getData()
    {
         String str = restTemplate.getForObject("http://localhost:8762/getOffer", String.class);
         return str;
    }

    @RequestMapping("/getRegData")
    public String getRegData()
    {
        // 通过你需要调用的服务的别名去进行调用
        String str = restTemplate.getForObject("http://service-2/getOffer", String.class);
        return str;
    }

}
