package com.example.codes.dttt;

/**
 * @Author: LZ
 * @Date: 2020/2/11 3:01 下午
 */
public class TMethod {
    //泛型方法
    public <T> T func(T obj) {
        System.out.println("泛型 method: " + obj);
        return obj;
    }
}
