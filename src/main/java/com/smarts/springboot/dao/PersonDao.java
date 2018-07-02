package com.smarts.springboot.dao;

import com.smarts.springboot.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Select("SELECT * FROM person where name = #{name}")
    // 返回 Map 结果集
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone")
    })
    Person findByName2(@Param("name") String name);

    List<Person> findAll();
}
