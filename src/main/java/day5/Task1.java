package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("Volvo");
        car.setColor("Silver");
        car.setYear(2012);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

    }
}

class Car{

    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
