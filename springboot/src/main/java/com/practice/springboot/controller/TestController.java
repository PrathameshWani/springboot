package com.practice.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping("/test")
    public String getMethodName() {
        return new String("Hi Prathamesh");
    }
    
}
