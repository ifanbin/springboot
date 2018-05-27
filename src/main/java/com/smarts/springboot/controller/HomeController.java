package com.smarts.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home(){
        System.out.println("hello, springboot");
        return "hello, springboot";
    }
}
