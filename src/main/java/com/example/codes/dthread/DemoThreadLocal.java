package com.example.codes.dthread;

import java.util.Locale;

/**
 * @Author: LZ
 * @Date: 2020/2/25 3:25 下午
 */
public class DemoThreadLocal {

    // threadLocal 数据和当前线程id 进行绑定：map<thread-id,value>
    protected static ThreadLocal<Integer>  threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 5;
        }
    };

    protected static  ThreadLocal<Locale> threadLocal1 = new ThreadLocal<Locale>() {

        @Override
        protected Locale initialValue() {
            return Locale.CHINA;
        }
    };

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(()->{
                threadLocal.set(10);
                System.out.println("thread result is :" + threadLocal.get()); //打印10
            });

            Thread.sleep(2000);
            Thread thread1  = new Thread(()->{
                Integer integer = threadLocal.get();
                System.out.println("thread-1 result is :" + integer);//打印5
            });
            thread.start();
            thread1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            threadLocal.remove(); // threadLocal 弱引用，value不会被主动回收，用完需主动销毁，否则导致内存溢出
            threadLocal1.remove();
        }

    }

}
