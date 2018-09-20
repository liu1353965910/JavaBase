package com.lqw.Thread;

/**
 * 线程休眠
 * 2018/09/18
 * Author:lqw
 */


public class MySleepThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i < 100;i++){
            System.out.println(getName()+":"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
