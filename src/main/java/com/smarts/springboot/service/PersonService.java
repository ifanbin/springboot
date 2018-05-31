package com.smarts.springboot.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smarts.springboot.dao.PersonDao;
import com.smarts.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public Person findByName(String name){
        return this.personDao.findByName(name);
    }

}
