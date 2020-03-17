package com.example.codes.dproxy;

import java.lang.reflect.Proxy;

/**
 * @Author: LZ
 * @Date: 2020/2/26 11:02 上午
 */
public class InvocationTest {

    public static void main(String[] args) {
        HelloProxy helloProxy = (HelloProxy) Proxy.newProxyInstance(
                InvocationTest.class.getClassLoader(),
                new Class[]{HelloProxy.class},
                new MyInvocationHandler(new HelloProxyImpl()));

        helloProxy.sayHello();
    }
}
