package com.example.demo.FeignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("service-2")
public interface FeignInterface {

    @GetMapping("/getOffer")
    public String getOffer();

}
