package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random rand= new Random();
        int min = 10000; //минимальное число
        int max = 0; //максимальное число
        int zeroEnd = 0; //заканчивается на ноль
        int zeroEndSum = 0; // сумма элеменов зак. на ноль

        for (int var:array){

            var = rand.nextInt(10000);

            if (var < min) min = var;
            if (var > max) max = var;
            if (var%10==0){
                zeroEnd++;
                zeroEndSum += var;
            }

        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zeroEnd);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + zeroEndSum);

    }
}
