package com.lqw.Thread;

import org.junit.Test;

/**
 * 测试
 * 2018/09/18
 * Author:lqw
 */


public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        //设置线程名称，可以调用setName()也可以使用有参构造方法设置
        th1.setName("Amy");
        th2.setName("Bob");
        //获取当前线程名称
        System.out.println(Thread.currentThread().getName());
        th1.start();
        th2.start();
    }

}
