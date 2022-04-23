package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane= new Airplane("Boeng",2011,127,7600);

        airplane.setYear(2012);
        airplane.setLength(227);

        airplane.fillUp(550);
        airplane.fillUp(600);

        airplane.info();

    }
}
