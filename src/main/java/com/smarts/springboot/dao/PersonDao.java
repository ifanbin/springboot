package com.smarts.springboot.dao;

import com.smarts.springboot.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 人员 DAO 接口类
 *
 * Created by fanb.
 */
@Repository
public interface PersonDao {

    /**
     * 根据人员名称，查询人员信息
     *
     * @param name 人员姓名
     */
    Person findByName(@Param("name") String name);
}
