package com.example.codes.dstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: LZ
 * @Date: 2020/3/17 3:16 下午
 */
public class DemoList {


    List<User> users = new ArrayList<>();
    private void init() {
        User user = new User("king", 20);
        User user1 = new User("zl", 30);
        User user2 = new User("test", 60);
        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public DemoList() {
        this.init();
    }


    public  void testFilter() {
        List<User> userList = users.stream().filter(user -> user.getAge() > 30).collect(Collectors.toList());
        for (User user : userList) {
            System.out.println("user info is : " + user.getName() + " : " + user.getAge());
        }
    }

    public List<String> testMap() {
        List<String> collect = users.stream().map(user -> {
            return user.getName();
        }).collect(Collectors.toList());

        for (String name : collect) {
            System.out.println("the user name is :" + name);
        }
        return collect;
    }

    public void testList2Map() {
        Map<String, Integer> userMap = users.stream().collect(Collectors.toMap(User::getName, User::getAge));

        for (Map.Entry<String, Integer> entry : userMap.entrySet()) {
            System.out.println("the user key is: " + entry.getKey() + " the values is :" + entry.getValue());
        }
    }


    public void testReduce() {
        Integer result = users.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);
        System.out.println("the reduce result is :" + result);
    }


    public static void main(String[] args) {
        DemoList demoList = new DemoList();
//        demoList.testFilter();in
//        demoList.testMap();
//        demoList.testList2Map();
        demoList.testReduce();
    }






}
