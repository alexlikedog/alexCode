package com.alex.dto;

import java.io.Serializable;

/**
 * @author alex
 * @Title: Employee
 * @ProjectName mvcstu
 * @Description: TODO
 * @date 2020-08-05  20:24 
 */
public class Employee implements Serializable {

    private static final long serialVersionUID = 8154002329735564909L;
    
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
