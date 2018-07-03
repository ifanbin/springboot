package com.smarts.springboot.entity;

import lombok.Data;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phone;

}
