package day13;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("John");
        User user2 = new User("Petr");
        User user3 = new User("Bill");

        user1.subscribe(user2);
        user2.subscribe(user1);

        user1.sendMessage(user2,"Привет!");
        user1.sendMessage(user2,"Как дела?");
        user2.sendMessage(user1,"Здорово!");
        user2.sendMessage(user1,"Да нормально все!");
        user2.sendMessage(user1,"Сам то как?");
        user3.sendMessage(user1,"Куда пропал товарищ?!");
        user3.sendMessage(user1,"Жду тебя, жду");
        user3.sendMessage(user1,"Скоро уйду");
        user1.sendMessage(user3,"Да иду уже!");

        MessageDatabase.showDialog(user1,user3);

    }
}
