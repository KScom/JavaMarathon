package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        File fileIn = new File("src/main/resources/shoes.csv");
        File fileOut = new File("src/main/resources/missing_shoes.txt");

        if(!fileOut.exists()) {
            try {
                fileOut.createNewFile();
            } catch (IOException e) {
                System.out.println("Невозможно создать файл");
            }
        }

        try {
            Scanner scanner = new Scanner(fileIn);
            PrintWriter printWriter = new PrintWriter(fileOut);

            while (scanner.hasNextLine()){

                String[] lineArray = scanner.nextLine().split(";");

                if(lineArray.length==3 && lineArray[2].equals("0")){

                    printWriter.println(lineArray[0] + ";" + lineArray[1] + ";" + lineArray[2]);

                }else {
                    System.out.println("Неверный формат");
                }
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}