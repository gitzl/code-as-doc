package com.example.codes.dthread;

/**
 * @Author: LZ
 * @Date: 2020/2/25 3:00 下午
 */
public class DemoVolatile {

     volatile boolean flag = false;
//    boolean flag = false;
    protected void doSomething() {
        while (!flag) {
            System.out.println("do something ing.......");
        }
    }

    protected void shutDown() {
        flag = true;
        System.out.println("shut down, stop do something");
    }


    // 不加volatile 出现死循环， thread1改变了变量，但是thread不可见
    // 可使用 volatile 让线程之间变量可见
    public static void main(String[] args) throws InterruptedException {
        DemoVolatile demoVolatile = new DemoVolatile();
        Thread thread = new Thread(()->demoVolatile.doSomething());
        thread.start();
        Thread.sleep(5000);
        Thread thread1 = new Thread(() -> demoVolatile.shutDown());
        thread1.start();
    }
}
