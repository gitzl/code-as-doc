package com.example.codes.dttt;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Author: LZ
 * @Date: 2020/2/11 3:23 下午
 */

//有限制通配符类型
public class TGeneric {
    public void doSomething(List< ? extends Number> list) {
        for (Number number : list) {
            System.out.println("测试通配符关键字:extend:" + number);
        }
    }

    public static void main(String[] args) {
//          指定了：extend number 传入字符串 报错 , 达到了约束
//        new TGeneric().doSomething(Arrays.asList(1, 2 , "test"));
          new TGeneric().doSomething(Arrays.asList(1 , 2 ,3 ));
    }
}
