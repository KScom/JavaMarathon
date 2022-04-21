package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int maxSum = 0;
        int sum = 0;
        int index = 0;
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) array[i] = rand.nextInt(10000);

        for (int i = 0; i < array.length; i++){

            if(i > 0 && i < array.length-1){
                sum = array[i-1] + array[i] + array[i+1];

                if(sum >= maxSum){
                    maxSum = sum;
                    index = i-1;
                }
            }
            sum = 0;
        }

        System.out.println(maxSum);
        System.out.println(index);
    }
}
