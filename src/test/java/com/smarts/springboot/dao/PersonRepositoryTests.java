package com.smarts.springboot.dao;

import com.smarts.springboot.entity.PersonEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTests {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private PersonPageRepository personPageRepository;

	@Test
	public void testsave() throws Exception {
		PersonEntity personEntity = new PersonEntity();
		personEntity.setId(18l);
		personEntity.setName("testname");
		personRepository.save(personEntity);

//		Assert.assertEquals(9, personRepository.findAll().size());
//		personRepository.delete(personRepository.findByName("aa1"));
	}

	@Test
	public void testQueryJpa() throws Exception {
		PersonEntity person = personRepository.findById(1l).get();
		Assert.assertNotNull(person);
	}

	@Test
	public void testQueryJpaPage() throws Exception{
		//sort 也可以直接作为参数传入
		Pageable pageable = PageRequest.of(0,10);
		System.out.println(" \n 分页查询用户："
				+ " PageNumber = " + pageable.getPageNumber()
				+ " PageSize = " + pageable.getPageSize());
		org.springframework.data.domain.Page<PersonEntity> persons = personPageRepository.findAll(pageable);
		Assert.assertNotNull(persons);
	}

}