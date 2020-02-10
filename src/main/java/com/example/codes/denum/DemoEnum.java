package com.example.codes.denum;

/**
 * @Author: LZ
 * @Date: 2020/2/6 2:54 下午
 */
public enum DemoEnum  {
    SUNDAY(1, 7,"周天") {
        String doSomeThing(String something){return  something;}
    },
    MONDAY(2, 1,"周一"){
        String doSomeThing(String something){return  something;}
    },
    TUESDAY(3, 2,"周二"){
        String doSomeThing(String something){return  something;}
    };

    /**
     * enum 被final修饰
     * 参数 建议直接定义final
     */
    private final int index;
    private final int day;
    private final String desc;

    /**
     * 通过构造方法 传参
     * @param index
     * @param day
     * @param desc
     */
    DemoEnum(int index, int day, String desc) {
        this.index = index;
        this.day = day;
        this.desc = desc;
    }


    /**
     * 枚举类中理论上 应该只有get方法 不应该有set方法
     * 被final修饰 属性不能被修改
     * @return
     */
    public int getDay() {
        return day;
    }

    public String getDesc() {
        return desc;
    }

    /***
     * 每个枚举定义index 而不是使用 ordinal位置
     * 避免枚举位置改变 导致访问不到之前到值
     * @return
     */
    public int getIndex() {
        return index;
    }

    /**
     * 定义抽象方法 每个枚举了可定义不同行为
     * @param something
     * @return
     */
    abstract String doSomeThing(String something);

    @Override
    public String toString() {
        return this.desc;
    }
}
