package com.lqw.Thread;

/**
 * 消费者
 * 2018/09/18
 * Author:lqw
 */


public class GetThread implements Runnable {
    private Student s;

    public GetThread() {

    }

    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true){
            s.get();
        }
    }
}
