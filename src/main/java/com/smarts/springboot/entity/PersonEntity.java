package com.smarts.springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Book 实体类
 *
 * Created by bysocket on 30/09/2017.
 */
@Entity
@Data
@Table(name="person")
public class PersonEntity implements Serializable {

    /**
     * 编号
     */
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phone;

}
