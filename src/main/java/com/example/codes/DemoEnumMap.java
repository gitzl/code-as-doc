package com.example.codes;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: LZ
 * @Date: 2020/2/7 10:19 上午
 */
public class DemoEnumMap {

    //EnumMap 强制约束key 为枚举类型 extend enum
    Map<DemoEnum, String>  demoEnumSetMap = new EnumMap<DemoEnum, String>(DemoEnum.class);

    public void printEnumMap() {
        for (DemoEnum demoEnum : DemoEnum.values()) {
            demoEnumSetMap.put(demoEnum, demoEnum.getDesc());
        }
        System.out.println(demoEnumSetMap);
    }

}
