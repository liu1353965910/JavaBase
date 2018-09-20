package com.lqw.Thread;

import java.util.concurrent.Callable;

/**
 * 依赖线程池存在
 * 2018/09/20
 * Author:lqw
 */


public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        return null;
    }
}
