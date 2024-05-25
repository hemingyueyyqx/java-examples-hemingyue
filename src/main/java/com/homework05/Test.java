package com.homework05;
import com.homework05.entity.*;
public class Test {
    private static User createUser() {
        Player player1 = new Player(1, "普通用户");
        Player player2 = new Player(2, "VIP");
        Game game1 = new Game(1, "魂斗罗");
        Game game2 = new Game(2, "超级马里奥");
        User user1 = new User(1,"Mike", new Player(1, "VIP"), new Game[]{game1, game2});
        return user1;
    }
    private static void listGames(User user) {
        for(Game i : user.getGames()) {
            System.out.println(i.getName());
        }

    }

    public static void main(String[] args) {
        //createUser();
        listGames(createUser());
    }
}
