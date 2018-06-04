package com.smarts.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HomeController {
    private final static Logger log = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(){
        log.info("hello, springboot");
        return "hello, springboot";
    }

    @RequestMapping("/hello")
    public String sayHello(){
        log.info("hello world");
        return "hello world";
    }
}
