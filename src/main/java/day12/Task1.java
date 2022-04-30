package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> auto = new ArrayList<>();
        auto.add("Mercedes");
        auto.add("Volvo");
        auto.add("BMW");
        auto.add("Lexus");
        auto.add("Lada");

        auto.add(3,"Ford");
        auto.remove(0);

        System.out.println(auto);
    }
}