package com.smarts.springboot.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.smarts.springboot.entity.Person;
import com.smarts.springboot.entity.PersonEntity;
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

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testQuery() throws Exception {
        Person person = personDao.findByName("张三");
        Assert.assertNotNull(person);
    }

    @Test
    public void testQueryAnnotation() throws Exception {
        Person person = personDao.findByName2("张三");
        Assert.assertNotNull(person);
    }

    @Test
    public void testQueryAll() throws Exception {
        PageHelper.startPage(2, 1);
        List<Person> persons = this.personDao.findAll();
        System.out.println("Total: " + ((Page) persons).getTotal());
        for (Person person : persons) {
            System.out.println("Person Name: " + person);
            Assert.assertEquals("张三", person.getName());
        }

    }

    //jpa-------------------------------------------------------
    @Test
    public void testQueryJpa() throws Exception {
        PersonEntity person = personRepository.findById(1l).get();
        Assert.assertNotNull(person);
    }

}
