package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/taxi_cars.txt");
        Scanner fileScan = new Scanner(file);

        Map<Integer,Point> carMap = new HashMap<>();

        while (fileScan.hasNextLine()){
            String[] var = fileScan.nextLine().split(" ");
            carMap.put(Integer.parseInt(var[0]),new Point(Integer.parseInt(var[1]),Integer.parseInt(var[2])));
        }

        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x,y;

        for (Map.Entry<Integer,Point> car:carMap.entrySet()){
            x = car.getValue().getX();
            y = car.getValue().getY();

            if((x<x1 && y>y1) && (x>x2 && y<y2)){
                System.out.println(car.getKey() + " " + x + " " + y);
            }
        }
    }
}