package SeaBattle;

import java.util.Arrays;

public class SeaField {

    private String[][] field = new String[10][10];
    final String SHIP = "\uD83D\uDFEB";
    final String BUSY = "\uD83D\uDFE6";
    final String FREE = "\uD83D\uDFEA";
    final String HIT = "\uD83D\uDFE5";
    final String SHOT = "\uD83D\uDFE7";

    public SeaField() {

        for (int i = 0; i < 10; i++)
            Arrays.fill(field[i], FREE);
    }

    public void print(){

        for (int i = 0; i < 10; i++) {
            Arrays.stream(field[i]).forEach(System.out::print);
            System.out.println();
        }

    }

    public boolean fire(int x, int y){

        if (field[x][y] == SHIP) {

            field[x][y] = HIT;

            if (chkFire(x, y))
                System.out.println("Ранил!");
            else
                System.out.println("Убил!");

            return true;
        }else {
            field[x][y] = SHOT;
            System.out.println("Мимо!");
            return false;
        }
    }

    public void aim(){ //прицеливаемся, вывод поля для другого игрока, без живых кораблей, с выстрелами

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {

                if (field[x][y] == SHIP || field[x][y]==BUSY){
                    System.out.print(FREE);
                }else {
                    System.out.print(field[x][y]);
                }

            }
            System.out.println();
        }
    }

    public int ships(){ // проверяем остаток живых кораблей

        int ships = 0;

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {

                if (field[x][y] == SHIP){
                    ships++;
                }
            }
        }
        return ships;
    }

    public void ship(int x, int y){ // вставляем корабль на поле

        for (int i = -1; i < 2; i++) { // расставляем ореол
            if ((x - i >= 0 && y > 0 && x - i < 10) && field[x - i][y - 1] != SHIP) // left
                field[x - i][y - 1] = BUSY;
            if ((x - i >= 0 && y < 9 && x - i < 10) && field[x - i][y + 1] != SHIP) //right
                field[x - i][y + 1] = BUSY;
            if ((x - i >= 0 && x - i <= 9) && field[x - i][y] != SHIP) //center
                field[x - i][y] = BUSY;
        }

        field[x][y] = SHIP;
    }

    public boolean chkShip(String[] array, int length){ // проверяем свободное место и длину

        if(length==1){ // однопалубный

            if(array.length!=2)
                return false;

            if (field[Integer.parseInt(array[0])][Integer.parseInt(array[1])] != FREE)
                return false;

        }else {

            if (array[0].equals(array[2])) {

                if (length != Math.abs(Integer.parseInt(array[1]) - Integer.parseInt(array[3])) + 1)// проверка длины
                    return false;

                for (int i = Integer.parseInt(array[1]); i <= Integer.parseInt(array[3]); i++) { //проверка места
                    if (field[Integer.parseInt(array[0])][i] != FREE)
                        return false;
                }
            } else if (array[1].equals(array[3])) {

                if (length != Math.abs(Integer.parseInt(array[0]) - Integer.parseInt(array[2])) + 1)// проверка длины
                    return false;

                for (int i = Integer.parseInt(array[0]); i <= Integer.parseInt(array[2]); i++) { // проверка места
                    if (field[i][Integer.parseInt(array[1])] != FREE)
                        return false;
                }
            }
        }
        return true;
    }

    public boolean chkFire(int x, int y){ // проверяем убил или ранил?

        boolean result = false;

        for (int i = 1; i < 4; i++){ // смотрим в лево
            if(y - i >= 0) {
                if (field[x][y - i] == SHIP) {
                    result = true;
                    break;
                } else if (field[x][y - i] == FREE || field[x][y - i] == SHOT) {
                    break;
                }
            }else {
                break;
            }
        }

        for (int i = 1; i < 4; i++){ // смотрим в право
            if(y + i <= 9) {
                if (field[x][y + i] == SHIP) {
                    result = true;
                    break;
                } else if (field[x][y + i] == FREE || field[x][y + i] == SHOT) {
                    break;
                }
            }else {
                break;
            }
        }

        for (int i = 1; i < 4; i++){ // смотрим вниз
            if(x + i <= 9) {
                if (field[x + i][y] == SHIP) {
                    result = true;
                    break;
                } else if (field[x + i][y] == FREE || field[x + i][y] == SHOT) {
                    break;
                }
            }else {
                break;
            }
        }

        for (int i = 1; i < 4; i++){ // смотрим вверх
            if(x - i >= 0) {
                if (field[x - i][y] == SHIP) {
                    result = true;
                    break;
                } else if (field[x - i][y] == FREE || field[x - i][y] == SHOT) {
                    break;
                }
            }else {
                break;
            }
        }

        return result;
    }

}
