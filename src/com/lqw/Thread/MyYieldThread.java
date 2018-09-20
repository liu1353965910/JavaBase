package com.lqw.Thread;

/**
 * 礼让线程
 * 2018/09/18
 * Author:lqw
 */


public class MyYieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            yield();
        }
    }
}
