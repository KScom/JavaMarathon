package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int rand;
        Player[] player = new Player[8];

        for (int i = 0; i < 6; i++){ //добавляем игроков
           rand = random.nextInt((Player.MAX_STAMINA - Player.MIN_STAMINA) + 1) + Player.MIN_STAMINA;
           player[i] = new Player(rand);
        }

        Player.info();

        //проверяем на добавление лишних игроков
        rand = random.nextInt((Player.MAX_STAMINA - Player.MIN_STAMINA) + 1) + Player.MIN_STAMINA;
        player[6] = new Player(rand);
        rand = random.nextInt((Player.MAX_STAMINA - Player.MIN_STAMINA) + 1) + Player.MIN_STAMINA;
        player[7] = new Player(rand);
        System.out.println("Игроков на поле: " +Player.countPlayers);

        for (int i = 0; i < 100; i++){ // игрок побежал
            player[2].run();
        }

        Player.info();

    }
}
