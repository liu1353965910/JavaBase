package com.lqw.Thread;

import java.util.Date;

/**
 * 中断线程
 * 2018/09/18
 * Author:lqw
 */


public class MyStopThread extends Thread {
    @Override
    public void run() {
        System.out.println("start:");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("中断");
        }
        System.out.println(new Date());

    }
}
