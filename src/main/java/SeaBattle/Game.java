package SeaBattle;

import java.util.Scanner;

public class Game {

    private User user1;
    private User user2;
    private SeaField field1;
    private SeaField field2;

    private boolean gameRun = true;

    public Game(User user1, User user2, SeaField field1, SeaField field2){
        this.user1 = user1;
        this.user2 = user2;
        this.field1 = field1;
        this.field2 = field2;
    }

    public void go(){

        Scanner scanner = new Scanner(System.in);

        while (true){ // Цикл игры

            while (true){ // Цикл хода игрока1

                if(!action(user1, field2, scanner)) {
                    break;
                }else{
                    if(field2.ships()==0){ //проверка на выигрыш
                        gameRun = false;
                        field2.print();
                        System.out.println("[" + user1.getName() + "] ВЫ ВЫГРАЛИ!");
                        break;
                    }
                }
            }

            if (!gameRun) break;

            while (true){ // Цикл хода игрока2
                if(!action(user2, field1, scanner)) {
                    break;
                }else{
                    if(field1.ships()==0){ // проверка на выигрыш
                        gameRun = false;
                        field1.print();
                        System.out.println("[" + user2.getName() + "] ВЫ ВЫГРАЛИ!");
                        break;
                    }
                }
            }

            if (!gameRun) break;

        }
    }

    private boolean action(User user, SeaField field, Scanner scanner){

        field.aim();
        System.out.println("[" + user.getName() + "] - ваш ход (формат x,y):");
        String[] fire = scanner.next().split(",");
        return field.fire(Integer.parseInt(fire[0]), Integer.parseInt(fire[1]));
    }
}
