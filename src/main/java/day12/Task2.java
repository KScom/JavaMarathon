package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        addNumbers(0,30, numList);
        addNumbers(300,350, numList);

        System.out.println(numList);

    }

    public static void addNumbers(int start, int stop, List list){

        for (int i = start; i <= stop; i++){
            if(i%2==0) list.add(i);
         }
    }
}
