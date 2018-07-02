package com.smarts.springboot.dao;

import com.smarts.springboot.entity.PersonEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 用户持久层操作接口
 *
 * Created by bysocket on 18/09/2017.
 */
public interface PersonPageRepository extends PagingAndSortingRepository<PersonEntity, Long> {

}
