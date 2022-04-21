package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");
        }
        else{

            a++;

            while (a < b){

                int ost5 = a % 5;
                int ost10 = a % 10;

                if( ost5 == 0 && ost10 != 0){
                    System.out.print( a + " ");
                }

                a++;
            }
        }
    }
}
