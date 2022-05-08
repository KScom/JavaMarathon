package SeaBattle;

import java.util.Scanner;

public class User {

    private SeaField field;
    private String name;

    public User(String name, SeaField field){
        this.field = field;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void init(){

        System.out.println("[" + name + "] - начинает расставлять корабли:");
        field.print();
        addShip(4);
        addShip(3);
        addShip(3);
        for (int i=0;i<3;i++)
            addShip(2);
        for (int i=0;i<1;i++)
            addShip(1);

    }

    private void addShip(int length){

        Scanner scanner= new Scanner(System.in);

        switch (length){
            case 4:
                System.out.println("Введите начальные и конечные координаты 4-х палубного корабля (формат x,y-x,y):");
                break;
            case 3:
                System.out.println("Введите начальные и конечные координаты 3-х палубного корабля (формат x,y-x,y):");
                break;
            case 2:
                System.out.println("Введите начальные и конечные координаты 2-х палубного корабля (формат x,y-x,y):");
                break;
            default:
                System.out.println("Введите начальные и конечные координаты 1-но палубного корабля (формат x,y):");
                break;
        }

        while (true) {
            String ship = scanner.nextLine();

            if(length!=1){

                String[] array = ship.split("[-,]"); //получаем массив с координатой корабля

                if(array.length==4) {

                    if (array[0].equals(array[2]) && field.chkShip(array, length)) { // определяем горизонтальное или вертикальное расположение и проверяем место

                        for (int i = Integer.parseInt(array[1]); i <= Integer.parseInt(array[3]); i++) {
                            field.ship(Integer.parseInt(array[0]), i); //вставляем корабль
                        }
                        field.print();
                        return;

                    } else if (array[1].equals(array[3]) && field.chkShip(array, length)) {

                        for (int i = Integer.parseInt(array[0]); i <= Integer.parseInt(array[2]); i++) {
                            field.ship(i, Integer.parseInt(array[1])); //вставляем корабль
                        }
                        field.print();
                        return;
                    } else {
                        System.out.println("Неверные координаты");
                    }
                }else{
                    System.out.println("Некорректный ввод");
                }
            }else if(length==1){ //если одиночный корабль

                String[] array = ship.split("[,]"); //получаем массив с координатой корабля
                if (array.length==2) {
                    if (field.chkShip(array, length)) {
                        field.ship(Integer.parseInt(array[0]), Integer.parseInt(array[1])); //вставляем корабль
                        field.print();
                        return;
                    } else {
                        System.out.println("Неверные координаты");
                    }
                }else {
                    System.out.println("Некорректный ввод");
                }
            }
        }
    }
}
