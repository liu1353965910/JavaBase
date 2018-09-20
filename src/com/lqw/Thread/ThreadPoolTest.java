package com.lqw.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 2018/09/20
 * Author:lqw
 */


public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建线程为2的线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //执行线程
        pool.submit(new MyCallable());
    }
}
