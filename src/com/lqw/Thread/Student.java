package com.lqw.Thread;

/**
 * 2018/09/18
 * Author:lqw
 */


public class Student {
    private int age;
    private String name;
    private boolean flag;   //判断是否有资源可以用

    public synchronized void set(String name, int age) {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //生产资源
        this.age = age;
        this.name = name;
        this.flag  = true;
        //生产者生产好资源，唤醒消费者消费
        this.notify();
    }

    public synchronized void get(){
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //消费者消费资源
        System.out.println(this.name+"==========="+this.age);
        this.flag = false;
        //消费者消费完资源唤醒生产者生产
        this.notify();
    }
}
