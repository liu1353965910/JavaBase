package com.lqw.Thread;

/**
 * 卖票
 * 2018/09/18
 * Author:lqw
 */


public class SellTickets implements Runnable{
    private int tickets = 100;
    @Override
    public void run() {
        while (true){
//            //同步锁
//            synchronized (this){
//                if(tickets > 0){
//                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//                }
//                tickets--;
//            }
            sell();
        }
    }

    private synchronized void sell() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
        }
        tickets--;
    }
}
