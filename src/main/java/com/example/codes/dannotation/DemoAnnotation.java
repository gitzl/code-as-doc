package com.example.codes.dannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: LZ
 * @Date: 2020/2/10 2:23 下午
 */


/***
 *
 * Retention : 标注什么时候运行 runtime 运行时执行
 * Target    : 标注该注解在什么地方声明，method 必须在方法上声明
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DemoAnnotation {
    String desc() default "demo annotation";
}
