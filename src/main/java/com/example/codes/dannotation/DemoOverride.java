package com.example.codes.dannotation;

/**
 * @Author: LZ
 * @Date: 2020/2/11 10:55 上午
 */
public class DemoOverride {

    private final char first;
    private final char second;

    public DemoOverride(char first, char second) {
        this.first = first;
        this.second = second;
    }


    /**
     * 重写方法必须带上注解：Override ，让编译器帮助检查重写方法返回值 名称 参数是否正确
     * @return
     */
    @Override
    public int hashCode() {
        return 31*first+second;
    }

    //重写hashCode 也最好重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  DemoOverride)) {
            return false;
        }

        DemoOverride demoOverride = (DemoOverride) obj;
        return first == demoOverride.first && second == demoOverride.second;
    }
}
