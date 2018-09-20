package com.lqw.Thread;

/**
 * 休眠测试
 * 2018/09/18
 * Author:lqw
 */


public class SleepThreadTest {
    public static void main(String[] args) {
        MySleepThread my1 = new MySleepThread();
        MySleepThread my2 = new MySleepThread();
        my1.setName("Amy");
        my2.setName("Bob");
        my1.start();
        my2.start();
    }
}
