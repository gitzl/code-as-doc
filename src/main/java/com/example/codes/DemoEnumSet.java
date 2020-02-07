package com.example.codes;

import java.util.EnumSet;
import java.util.Set;

/**
 * @Author: LZ
 * @Date: 2020/2/7 9:32 上午
 */
public class DemoEnumSet {
    private static void printEnums(Set<DemoEnum> demoEnums) {
        for (DemoEnum demoEnum: demoEnums) {
            System.out.println(demoEnum.toString());
        }
    }

    class  test {
        protected void  test() {
            //EnumSet 枚举集合
            DemoEnumSet.printEnums(EnumSet.of(DemoEnum.SUNDAY, DemoEnum.MONDAY));
        }
    }

}
