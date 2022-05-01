package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file1 = new File("people.txt");
        System.out.println(parseFileToObjList(file1).toString());

    }

    public static List<Person> parseFileToObjList(File file){

        List<Person> personList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){

                String[] line=scanner.nextLine().split(" ");

                if(Integer.parseInt(line[1])<=0){
                    try {
                        throw new IOException();
                    } catch (IOException e){
                        System.out.println("Некорректный входной файл");
                    }
                }else{
                    personList.add(new Person(line[0], Integer.parseInt(line[1])));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return personList;
    }
}
