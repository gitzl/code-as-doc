package com.example.codes.dttt;

/**
 * @Author: LZ
 * @Date: 2020/2/11 2:53 下午
 */

// 泛型有三种使用方式：泛型类、泛型接口、泛型方法 这里定义类型：T 由外部传入决定具体类型
public class TClass<T> {

    // 泛型类
    private T key ;

    public TClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
