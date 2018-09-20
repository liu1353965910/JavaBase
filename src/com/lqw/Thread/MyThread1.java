package com.lqw.Thread;

/**
 * 线程1
 * 2018/09/18
 * Author:lqw
 */


public class MyThread1 extends Thread {

    public MyThread1() {

    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            //获取该线程的名字
            System.out.println(super.getName() + ":" + i);
        }
    }
}
