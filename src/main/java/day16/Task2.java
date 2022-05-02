package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        if(!file1.exists()) file1.createNewFile();
        if (!file2.exists()) file2.createNewFile();

        PrintWriter pw1 = new PrintWriter(file1);
        PrintWriter pw2 = new PrintWriter(file2);
          Random random = new Random();
          int count = 1;
          int summa = 0;
          int randValue = 0;
          double arithmeticMean = 0.0;
          StringBuilder string1 = new StringBuilder("");
          StringBuilder string2 = new StringBuilder("");

        for (int i = 0; i < 1000; i++){

            randValue = random.nextInt(100);
            string1.append(randValue + " ");

            if (count==20){
                arithmeticMean = (double) summa/20;
                string2.append(arithmeticMean + " ");
                count = 1;
                summa = 0;
            } else {
                summa += randValue;
                count ++;
            }

        }
        pw1.println(string1);
        pw2.println(string2);
        pw1.close();
        pw2.close();

        printResult(file2);
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);

            double summa = 0.0;

            String[] line = scanner.nextLine().split(" ");

            for (String x:line){
                summa += Double.parseDouble(x);
            }

            System.out.println((int) summa);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
