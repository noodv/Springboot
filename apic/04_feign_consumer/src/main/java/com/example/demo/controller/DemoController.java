package com.example.demo.controller;

import com.example.demo.FeignInterface.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private FeignInterface feignInterface;

    @GetMapping("/getData")
    public String getData()
    {
        return feignInterface.getOffer();
    }

}
