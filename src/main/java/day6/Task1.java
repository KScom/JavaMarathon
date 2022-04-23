package day6;
public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.info();
        car1.setYear(2010);
        System.out.println(car1.yearDifference(2020));

        Motorbike bike1 = new Motorbike("BMW","White", 2012);
        bike1.info();
        System.out.println(bike1.yearDifference(2008));

    }
}
