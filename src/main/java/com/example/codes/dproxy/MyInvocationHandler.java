package com.example.codes.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: LZ
 * @Date: 2020/2/26 10:58 上午
 */
public class MyInvocationHandler implements InvocationHandler {


    //$Proxy0 extends Proxy implements Person 代理对象已经继承了Proxy,java只能单继承
    private Object target ;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("execute proxy invoke method.");
        return method.invoke(target, args);
    }
}
