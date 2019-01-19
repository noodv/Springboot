package com.example.controller;

import com.example.vo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController
{

    @RequestMapping("/getOffer")
    public String getOffer()
    {
        return "I am 02_eureka_client!";
    }

    // get接收参数
    @RequestMapping("/getUser")
    public String getUser(User user)
    {
        return user.toString();
    }

    // post接收参数
    @RequestMapping("/postUser")
    public String postUser(@RequestBody User user)
    {
        return user.toString();
    }

    @RequestMapping("/putUser")
    public String putUser(User user)
    {
        return user.toString();
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(User user)
    {
        return user.toString();
    }

}
