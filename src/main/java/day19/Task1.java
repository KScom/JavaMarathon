package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[….,«»„<>:;()?!\"\\s–]+");

        Map<String, Integer> mapWords = new HashMap<>();

        while (scanner.hasNext()){
            String word = scanner.next().toLowerCase();

            if(mapWords.get(word)==null)
                mapWords.put(word,1);
            else
                mapWords.put(word,mapWords.get(word)+1);
        }

        mapWords.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(100)
                .forEach(System.out::println); //чичиков=608
    }
}