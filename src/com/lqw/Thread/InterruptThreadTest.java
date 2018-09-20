package com.lqw.Thread;

/**
 * 中断该线程，并且抛出异常
 * 2018/09/18
 * Author:lqw
 */


public class InterruptThreadTest {
    public static void main(String[] args) {
        MyStopThread mt1 = new MyStopThread();
        mt1.start();
        try {
            Thread.sleep(50);
            mt1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
