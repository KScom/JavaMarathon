package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1= new Airplane("Boeng",2011,127,7600);
        Airplane airplane2= new Airplane("Ту-154",1998,131,8900);

        Airplane.compareAirplanes(airplane1,airplane2);

    }
}