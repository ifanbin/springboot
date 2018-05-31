package com.smarts.springboot.controller;

import com.smarts.springboot.entity.Person;
import com.smarts.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "person",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public Person findByName(String name){
        Person person = this.personService.findByName(name);
        return person;
    }
}
