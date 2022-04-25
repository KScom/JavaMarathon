package day7;

public class Player {

    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 90;
    static  int countPlayers;

    public Player(int stamina){
        this.stamina = stamina;
        if (countPlayers<6) countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if(this.stamina!=0) { //проверяем есть ли на поле этот игрок
            this.stamina--;
            if(this.stamina==0) countPlayers--; // удаляем игрока с поля
        }
    }

    public static void info(){

            switch (countPlayers){
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных места");
                    break;
                case 5:
                    System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободное место");
                    break;
                case 6:
                    System.out.println("На поле нет свободных мест");
                    break;
                default:
                    System.out.println("Все места свободны");
            }
        }

}


