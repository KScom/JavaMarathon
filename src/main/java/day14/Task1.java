package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("numbers.txt");
        printSumDigits(file);
    }
    public static void printSumDigits(File file){

        try {
            Scanner scanner = new Scanner(file);

            String[] input = scanner.nextLine().split(" ");

            if(input.length != 10){
                try {
                    throw new IOException();
                } catch (IOException e){
                    System.out.println("Некорректный входной файл");
                }
            }else{

                int sumNumbers = 0;
                int cnt = 0;

                for (String x:input){
                    sumNumbers += Integer.parseInt(x);
                }

                System.out.println(sumNumbers);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}