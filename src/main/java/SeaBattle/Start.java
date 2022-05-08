package SeaBattle;

public class Start {

    public static void main(String[] args) {

        SeaField field1 = new SeaField();
        User user1 = new User("Player1", field1);

        SeaField field2 = new SeaField();
        User user2 = new User("Player2", field2);

        user1.init();
        user2.init();

        Game game = new Game(user1,user2,field1,field2);

        for (int i = 0; i < 20; i++)
            System.out.println();

        game.go();
    }
}
