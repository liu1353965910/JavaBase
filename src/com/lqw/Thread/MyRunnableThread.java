package com.lqw.Thread;

/**
 * 实现runnable接口
 * 2018/09/18
 * Author:lqw
 */


public class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i< 100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
