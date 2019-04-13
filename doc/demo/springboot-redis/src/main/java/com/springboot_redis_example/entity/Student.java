package com.springboot_redis_example.entity;


import java.io.Serializable;

/**
 * @Author: zhangqihao
 * @Date: 2019/4/11 20:47
 * @Version 1.0
 */
public class Student implements Serializable {
    //学生ID
    private Integer id;
    //学生年龄
    private int age;
    //学生性别
    private String sex;
    //学生住址
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
