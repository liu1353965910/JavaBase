package com.lqw.Thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器
 * 2018/09/20
 * Author:lqw
 */


public class TimerTaskTest {
    public static void main(String[] args) {
        Timer t = new Timer();
        t.schedule(new MyTask(),3000);
    }
}

class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("boom");
    }
}
