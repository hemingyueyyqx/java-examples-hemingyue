package com.example06;

import java.nio.file.Path;

public class Test {
    public static void main(String[] args) {
        String p1 = "C:/";
        String p2 = "a";
        String p3 = "b";
        System.out.println(Path.of(p1).resolve(p2).resolve(p3));
    }
}
