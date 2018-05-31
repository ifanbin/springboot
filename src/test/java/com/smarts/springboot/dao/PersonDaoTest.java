package com.smarts.springboot.dao;

import com.smarts.springboot.entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonDaoTest {

    @Autowired
    private PersonDao personDao;

    @Test
    public void testQuery() throws Exception {
        Person person = personDao.findByName("张三");
        Assert.assertNotNull(person);
    }

}
