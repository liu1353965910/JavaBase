package com.lqw.reflect;

/**
 * Person类
 * 2018/09/15
 * Author:lqw
 */


public class Person {
    private String name;
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void speak(){
        System.out.println(this.name);
    }
}
