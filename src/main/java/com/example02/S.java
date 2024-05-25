package com.example02;

public class S extends F{
    public void getS() {
        System.out.println("S getS");
    }
    @Override
    public void getF() {
        System.out.println("S getF");
    }

    @Override
    public void getI() {
        System.out.println("S getI");
    }
}
