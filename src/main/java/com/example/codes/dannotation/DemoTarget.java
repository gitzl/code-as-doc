package com.example.codes.dannotation;

/**
 * @Author: LZ
 * @Date: 2020/2/10 2:36 下午
 */
public class DemoTarget {

    @DemoAnnotation
    public void doSomeThing(String label) {
        System.out.println("方法中标注：DemoAnnotation注解 : " + label);
    }


}
