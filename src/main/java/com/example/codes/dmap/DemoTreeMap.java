package com.example.codes.dmap;

import java.util.*;

/**
 * @Author: LZ
 * @Date: 2020/2/25 4:37 下午
 */
public class DemoTreeMap {


    // treedMap 基于key 进行排序
    protected void doSomething() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2,10);
        treeMap.put(1, 12);
        treeMap.put(9, 11);

        for (Map.Entry<Integer, Integer> entry:treeMap.entrySet()) {
            System.out.println("the result key and value is " + entry.getKey() + " :" + entry.getValue());
        }
    }

    protected void addUser() {
        User user = new User();
        user.setAge(18);
        user.setName("king");

        User user1 = new User();
        user1.setAge(20);
        user1.setName("zl");

        User user2 = new User();
        user2.setAge(8);
        user2.setName("zl");

        // 基于Comparator 进行排序
        TreeMap<User, String> treeMap = new TreeMap<>(new Comparator<User>() {

            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        treeMap.put(user1, "user-1");
        treeMap.put(user, "user");
        treeMap.put(user2,"user-2");

        Iterator<Map.Entry<User, String>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<User, String> userStringEntry = iterator.next();
            System.out.println("the result user is :" + userStringEntry.getKey().getAge());
        }

    }



    public static void main(String[] args) {
        DemoTreeMap demoTreeMap = new DemoTreeMap();
//        demoTreeMap.doSomething();
        demoTreeMap.addUser();
    }
}
