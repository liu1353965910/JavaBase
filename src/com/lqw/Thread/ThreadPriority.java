package com.lqw.Thread;

/**
 * 线程调度优先级
 * 2018/09/18
 * Author:lqw
 */


public class ThreadPriority {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1("Amy");
        MyThread1 th2 = new MyThread1("Bob");
        MyThread1 th3 = new MyThread1("Cov");
        //获取该线程的优先级
        System.out.println("Priority="+th1.getPriority());
        //设置该线程的优先级
        th1.setPriority(10);
        th2.setPriority(1);
        th3.setPriority(7);
        th1.start();
        th2.start();
        th3.start();
    }
}
