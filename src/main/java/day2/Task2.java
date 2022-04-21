package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");

        }else {
            for(int i = a + 1; i < b; i++){
                int ost5 = i % 5;
                int ost10 = i % 10;
                if (ost5 == 0 && ost10 != 0) System.out.print(i + " ");
            }
        }

    }
}
