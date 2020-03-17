package com.example.codes.dproxy;

/**
 * @Author: LZ
 * @Date: 2020/2/26 10:57 上午
 */
public class HelloProxyImpl implements HelloProxy {
    @Override
    public void sayHello() {
        System.out.println("proxy demo by JDK method");
    }
}
