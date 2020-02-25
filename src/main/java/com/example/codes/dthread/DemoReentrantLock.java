package com.example.codes.dthread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: LZ
 * @Date: 2020/2/24 11:34 上午
 */
public class DemoReentrantLock implements Runnable {

    public static ReentrantLock reentrantLock = new ReentrantLock();
//    public static ReentrantLock reentrantLock = new ReentrantLock(true); 可设置公平锁，先来先得到锁
    public static  int i = 0;


    @Override
    public void run() {
        for (int j = 0; j <10000 ; j++) {
            reentrantLock.lock();
//            reentrantLock.tryLock(5, TimeUnit.SECONDS); 加锁，设置超时时间
//            reentrantLock.lockInterruptibly(); 中断锁
            try {
                i++;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DemoReentrantLock demoReentrantLock = new DemoReentrantLock();
        Thread thread = new Thread(demoReentrantLock);
        Thread thread1 = new Thread(demoReentrantLock);
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println("the result is :" + i);
    }


}
