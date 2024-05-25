package com.excample01;

public class Student {
    private String name;
    private Sex sex;

    public Student() {}
    public Student(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }
    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(Sex sex) {

        this.sex = sex;
    }
    public Sex getSex() {

        return sex;
    }

}
