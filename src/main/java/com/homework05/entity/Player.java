package com.homework05.entity;

public class Player {
    private int id;
    private String name;
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
