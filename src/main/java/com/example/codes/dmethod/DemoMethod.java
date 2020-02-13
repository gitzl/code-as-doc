package com.example.codes.dmethod;

import java.math.BigInteger;

/**
 * @Author: LZ
 * @Date: 2020/2/13 10:18 上午
 */
public class DemoMethod {


    /**
     * 写一个方法应该考虑都点
     * 1： 方法开头，参数做必要检查 及时跑出异常或者返回
     * 2： 简短易理解点方法名 参考java api
     * 3： 不要过于追求提供便利点方法，只有当一项操作经常被重复使用，考虑提供便捷方式
     * 4： 参数尽量少于4个 甚至更少
     * 5： 参考优先考虑接口 再是 类
     *
     *
     *
     */
    public BigInteger doSomething(BigInteger m) {
        if (m.signum() <= 0) {
            throw new ArithmeticException("the sum <=0" + m);
        }
        return m;
    }

}
