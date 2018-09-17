package com.lqw.io;

import java.io.Serializable;

/**
 * student类
 * 2018/09/17
 * Author:lqw
 */


public class Student implements Serializable {
    private static final long serialVersionUID = 4903603128198451448L;
    private String name;

    //该属性不能序列化
    transient int id;

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
