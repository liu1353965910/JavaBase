package com.lqw.Thread;

/**
 * 将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java 虚拟机退出。
 * 该方法必须在启动线程前调用。
 * 2018/09/18
 * Author:lqw
 */


public class DaemonThreadTest {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1("Amy");
        MyThread1 my2 = new MyThread1("Bob");
        my1.setDaemon(true);
        my2.setDaemon(true);
        my1.start();
        my2.start();
        for(int i = 0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
