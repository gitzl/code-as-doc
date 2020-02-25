package com.example.codes.dthread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: LZ
 * @Date: 2020/2/25 11:32 上午
 */
public class DemoAtomicInteger implements  Runnable {

    /*****
     * 锁：独占锁和共享锁  公平锁（FIFO 先来先得）和非公平
     * 锁：主要提供2个功能：互斥  可见
     *
     *
     *
     *
     *
     */

    private static int count = 0;
     //synchronized 独占锁
     protected  synchronized void increment() {
         for (int i = 0; i <10000 ; i++) {
             count ++;
         }
         System.out.println("data" + count );
    }


    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    protected   void incrementByAtomic() {
        for (int i = 0; i <10000 ; i++) {
             atomicInteger.getAndIncrement();//线程安全 CAS unsafe实现
        }
        System.out.println("atomic data" + atomicInteger.get() );
    }

    public static void main(String[] args) throws InterruptedException {
         DemoAtomicInteger demoAtomicInteger = new DemoAtomicInteger();
         Thread thread1 = new Thread(demoAtomicInteger);
         thread1.start();
         Thread thread2 = new Thread(demoAtomicInteger);
         thread2.start();
         Thread.sleep(5000);
        System.out.println("result : " + count); //期望多个2线程结果为 20000

    }

    @Override
    public void run() {
        this.increment();
//        this.incrementByAtomic();
    }
}
