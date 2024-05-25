package com.homework05.entity;

public class User {
    private int id;
    private String name;
    private Player player;
    private Game[] games;
    public User(int id, String name, Player player, Game[] games) {
        this.id = id;
        this.name = name;
        this.player = player;
        this.games = games;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Player getPlayer() {
        return player;
    }
    public Game[] getGames() {
        return games;
    }
}
