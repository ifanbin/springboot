package com.smarts.springboot.controller;

import com.smarts.springboot.entity.Person;
import com.smarts.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "person",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PersonController {
    @Autowired
    private StringRedisTemplate template;

    @Autowired
    private PersonService personService;

    @GetMapping
    public Person findByName(String name){
        Person person = this.personService.findByName(name);
        return person;
    }

    @RequestMapping("/setValue")
    public String setValue(){
        if(!template.hasKey("name")){
            template.opsForValue().append("name", "王二小");
            return "使用redis缓存保存数据成功";
        }else{
            template.delete("name");
            return "key已存在";
        }
    }

    @RequestMapping("/getValue")
    public String getValue(){

        if(!template.hasKey("name")){
            return "key不存在，请先保存数据";
        }else{
            String name = template.opsForValue().get("name");//根据key获取缓存中的val
            return "获取到缓存中的数据：name："+name;
        }
    }

}
