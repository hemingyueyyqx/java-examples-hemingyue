package com.excample01;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("HE", Sex.FEMALE);
        Student s2 = new Student();
        s2.setName("LIU");
        s2.setSex(Sex.MALE);
        System.out.println(s1.getName());
        System.out.println(s1.getSex());
        System.out.println(s2.getName());
        System.out.println(s2.getSex());
    }
}
