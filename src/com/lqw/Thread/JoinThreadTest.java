package com.lqw.Thread;

/**
 * join() 该线程执行完后其他线程才开始执行
 * 等待该线程终止
 * 2018/09/18
 * Author:lqw
 */


public class JoinThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 my1 = new MyThread1("Amy");
        MyThread1 my2 = new MyThread1("Bob");
        MyThread1 my3 = new MyThread1("Coo");
        my1.start();
        //等待该线程终止
        my1.join();

        my2.start();
        my3.start();
    }
}
