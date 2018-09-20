package com.lqw.Thread;

/**
 * java解决生产者与消费者问题
 * 2018/09/18
 * Author:lqw
 */


public class ProducerConsumerProblemTest {
    public static void main(String[] args) {
        Student student = new Student();
        GetThread g = new GetThread(student);
        SetThread s = new SetThread(student);
        Thread t1 = new Thread(g);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}
