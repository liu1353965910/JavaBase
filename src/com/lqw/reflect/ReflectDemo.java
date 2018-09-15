package com.lqw.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射例子
 * 2018/09/15
 * Author:lqw
 */


public class ReflectDemo {
    @Test
    public void reflectTest() throws Exception{
        //从内存获取person类
        Class clazz1 = Class.forName("com.lqw.reflect.Person");
        //调用无参构造方法创建person实例
        Person p = (Person) clazz1.newInstance();
        //调用类中的方法
        p.setName("aa");
        //获取类中的有参构造方法
        Constructor constructor =clazz1.getDeclaredConstructor(String.class);
        //调用有参构造方法创建person实例
        Person p1 = (Person) constructor.newInstance("aa");
        System.out.println(p1.getName());

        //获取类中的一般方法
        Method method = clazz1.getDeclaredMethod("speak");
        method.invoke(p1);
        //获取类中的属性
        Field field = clazz1.getDeclaredField("name");
        //设置属性的访问权限
        field.setAccessible(true);
        field.set(p,"bb");
        System.out.println(p.getName());
    }
}
