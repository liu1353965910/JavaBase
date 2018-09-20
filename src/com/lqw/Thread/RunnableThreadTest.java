package com.lqw.Thread;

/**
 * 声明实现 Runnable 接口的类。
 * 该类然后实现 run 方法。
 * 然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动
 * 2018/09/18
 * Author:lqw
 */


public class RunnableThreadTest {
    public static void main(String[] args) {
        //相同功能的类只创建一次
        MyRunnableThread mrt = new MyRunnableThread();
        Thread th1 = new Thread(mrt);
        Thread th2 = new Thread(mrt);
        th1.start();
        th2.start();
    }
}
