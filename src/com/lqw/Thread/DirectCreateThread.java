package com.lqw.Thread;

/**
 * 用匿名内部类直接创建线程
 * 2018/09/18
 * Author:lqw
 */


public class DirectCreateThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i ++){
                    System.out.println(getName()+"=="+i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i ++){
                    System.out.println(Thread.currentThread().getName()+"=="+i);
                }
            }
        }){}.start();
    }
}
