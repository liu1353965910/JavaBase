package com.lqw.Thread;

/**
 * 2018/09/18
 * Author:lqw
 */


public class SellTest {
    public static void main(String[] args) {
        SellTickets st = new SellTickets();
        Thread th1 = new Thread(st);
        Thread th2 = new Thread(st);
        Thread th3 = new Thread(st);
        th1.setName("窗口1");
        th1.setName("窗口2");
        th1.setName("窗口3");
        th1.start();
        th2.start();
        th3.start();
    }
}
