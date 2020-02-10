package com.example.codes.denum;

/**
 * @Author: LZ
 * @Date: 2020/2/10 1:59 下午
 */
public enum DemoExtendEnum implements Operation {

    //枚举类被final修饰不能修改，可以通过实现接口扩展功能，实现：可伸缩枚举
    SUNDAY("周天"){
        @Override
        public void doSomething() {
            System.out.println("在家休息，看书。。。。。");
        }
    },
    MONDAY("周一") {
        @Override
        public void doSomething() {
            System.out.println("开始上班，准备材料。。。。。");
        }
    };

    private final String label;

    DemoExtendEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
