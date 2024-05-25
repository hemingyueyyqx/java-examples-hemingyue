package com.example02;

public class A extends F {
    //private int i;
    public void getA() {
        System.out.println("A getA");
    }

    @Override
    public void getF() {
        super.getF();
    }

    @Override
    public void getI() {
        super.getI();
    }
}
