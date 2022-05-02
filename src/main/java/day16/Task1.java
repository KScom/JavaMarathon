package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("numbers.txt");
        printResult(file);
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);

            String[] arrayString = scanner.nextLine().split(" ");
            double x = 0.0;

            for (String string:arrayString){
                x += Double.parseDouble(string);
            }

            double result = x / arrayString.length;

            System.out.printf(result + " --> %.3f", result);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}