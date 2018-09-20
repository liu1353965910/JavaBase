package com.lqw.Thread;

/**
 * 生产者
 * 2018/09/18
 * Author:lqw
 */


public class SetThread implements Runnable {
    private Student s;
    private int i = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true){
            if (i % 2 == 0) {
                s.set("Amy", 20);
            } else {
                s.set("Bob", 21);
            }
            i++;
        }

    }
}
