package com.lqw.Thread;

/**
 * 暂停当前正在执行的线程对象，并执行其他线程
 * 2018/09/18
 * Author:lqw
 */


public class YieldThreadTest {
    public static void main(String[] args) {
        MyYieldThread my1 = new MyYieldThread();
        MyYieldThread my2 = new MyYieldThread();
        my1.setName("Amy");
        my2.setName("Bob");
        my1.start();
        my2.start();
    }
}
