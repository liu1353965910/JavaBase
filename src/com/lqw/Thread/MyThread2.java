package com.lqw.Thread;

/**
 * 线程2
 * 2018/09/18
 * Author:lqw
 */


public class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取该线程的名字
            System.out.println(super.getName() + ":" + i);
        }
    }
}
