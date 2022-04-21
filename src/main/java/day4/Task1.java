package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int arrayLength = scan.nextInt();
        int[] array = new int[arrayLength];
        int more8 = 0; // чисел больше 8
        int equal1 = 0; // равно 1
        int evenNum = 0; //колво четных
        int summa = 0; //сумма всех

        for (int i = 0; i < arrayLength; i++){

            array[i] = rand.nextInt(10);

            if(array[i]>8) more8++;
            if(array[i]==1) equal1++;
            if(array[i]%2==0) evenNum++;
            summa += array[i];

        }

        for (int varArray:array){
            System.out.print(varArray + " ");
        }

        System.out.println("\nДлина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + equal1);
        System.out.println("Количество четных чисел: " + evenNum);
        System.out.println("Количество нечетных чисел: " + (arrayLength - evenNum));
        System.out.println("Сумма всех элементов массива: " + summa);

    }
}
