package com.smarts.springboot.dao;

import com.smarts.springboot.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Person 数据持久层操作接口
 *
 * Created by bysocket on 09/10/2017.
 */
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    PersonEntity findByName(String name);
}
