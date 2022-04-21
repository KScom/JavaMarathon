package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] array = new int[12][8];
        int maxSum = 0;
        int sum = 0;
        int index = 0;
        Random rand = new Random();

        for (int m = 0; m < 12; m ++ ){

            for(int n = 0; n < 8; n ++){
                array[m][n] = rand.nextInt(50);
                sum += array[m][n];
            }

            if(sum >= maxSum){
                maxSum = sum;
                index = m;
            }

            sum = 0;
        }

        System.out.println("Ответ: " + index);

    }
}
