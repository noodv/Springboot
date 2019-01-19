package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @GetMapping("/getUser")
    public String getUser()
    {
        return "I am user!";
    }

}
