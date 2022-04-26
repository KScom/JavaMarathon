package day8;

public class Task1 {
    public static void main(String[] args) {

        long startConcat = System.currentTimeMillis();
        String cocatString = "";

        for (int i = 0; i <= 20000; i++){
            cocatString += i+" ";
        }

        System.out.println(cocatString);

        long stopConcat = System.currentTimeMillis();
        long startStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder= new StringBuilder();

        for (int i = 0; i <= 20000; i++){

            stringBuilder.append(" " + i);

        }

        long stopSringBuilder = System.currentTimeMillis();

        System.out.println(stringBuilder.toString());
        System.out.println("Длительность работы при конкатинации в мс: " + (stopConcat - startConcat));
        System.out.println("Длительность работы StringBuilder в мс: " + (stopSringBuilder - startStringBuilder));
    }
}
