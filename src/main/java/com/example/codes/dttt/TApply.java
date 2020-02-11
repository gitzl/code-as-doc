package com.example.codes.dttt;

/**
 * @Author: LZ
 * @Date: 2020/2/11 2:56 下午
 */
public class TApply implements  TInterface{

    public void apply() {
        TClass<String> tClass = new TClass<>("传入 String 类型");
        tClass.getKey();
    }

    public static void main(String[] args) {
        new TApply().apply();

        new TMethod().func("test TMethod");
    }


    @Override
    public Object doSomeThing(Object desc) {
        return desc;
    }
}
