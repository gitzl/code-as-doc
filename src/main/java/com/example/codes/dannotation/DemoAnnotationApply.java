package com.example.codes.dannotation;

/**
 * @Author: LZ
 * @Date: 2020/2/10 2:39 下午
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/***
 *  演示大多场景怎样使用注解
 */
public class DemoAnnotationApply {

    /**
     * 获取class 三种方式：
     *         DemoTarget demoTarget = new DemoTarget();
     *         1：  Class<? extends DemoTarget> demoTargetClass = demoTarget.getClass();
     *         2：  Class<?> demoTarget1 = Class.forName("DemoTarget");
     *         3：  Class<?> target = DemoTarget.class;
     *
     */

    /****
     *  反射调用方法声明了注解：DemoAnnotation
     */
    public void  apply() {
        Class<?> target = DemoTarget.class;
        Method[] declaredMethods = target.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(DemoAnnotation.class)) {
                try {
                    //调用标注了注解：DemoAnnotation 的方法
                    declaredMethod.invoke(new DemoTarget(), "apply annotation");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /***
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        DemoAnnotationApply demoAnnotationApply = new DemoAnnotationApply();
        demoAnnotationApply.apply();
    }

}
