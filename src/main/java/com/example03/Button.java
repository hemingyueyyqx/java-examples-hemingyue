package com.example03;

public class Button extends View{

    private String name;
    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
