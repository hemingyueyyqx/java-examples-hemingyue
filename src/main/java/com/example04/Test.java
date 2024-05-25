package com.example04;

import com.example02.S;

import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        User user1 = new User(1, "lily", "Harbin");
        User user2 = new User(2, "jackson", "Harbin");
        User user3= new User(3, "jon", "Harbin");
        User user4 = new User(4, "jan", "Beijing");
        User user5 = new User(5, "lucy", "Beijing");
        Set<User> users = new HashSet<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        setUsersMapByCityTest(users);


    }
    private static List<User> setToList(Set<User> users) {
        return users.stream().toList();
    }
    private static void removeUserById(Set<User> users, int id) {
        Iterator<User> userIterator = users.iterator();
        while(userIterator.hasNext()) {
            User u = userIterator.next();
            if(id == u.getId()) {
                userIterator.remove();
            }
        }
    }
    private static void setUsersMapByCityTest(Set<User> users) {
        List<User> list  = users.stream().toList();
        Map<String, List<User>> map = users.stream()
                .collect(Collectors.groupingBy(User ::getCity));
        for(Map.Entry<String, List<User>> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey());
            System.out.println("Value = " );
            for(User i : entry.getValue()) {
                System.out.println("id : " + i.getId() + " name : " + i.getName() + " city : " + i.getCity());
            }
        }


    }
}
