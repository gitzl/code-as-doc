package com.example.codes;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @Author: LZ
 * @Date: 2020/2/7 9:32 上午
 */
public class DemoEnumSet {
    private static void printEnums(Set<DemoEnum> demoEnums) {

        //for each
        for (DemoEnum demoEnum: demoEnums) {
            System.out.println(demoEnum.toString());
        }


        //迭代遍历
        Iterator<DemoEnum> iterator = demoEnums.iterator();
        while (iterator.hasNext()) {
            DemoEnum demoEnum = iterator.next();
            System.out.println(demoEnum.toString());
        }
    }



    //EnumSet.of(...)
    class  test {
        protected void  test() {
            //EnumSet 枚举集合
            DemoEnumSet.printEnums(EnumSet.of(DemoEnum.SUNDAY, DemoEnum.MONDAY));
        }
    }

}
