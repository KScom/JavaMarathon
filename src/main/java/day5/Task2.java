package day5;
public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("BMW","White",2020);

        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());

    }
}
class Motorbike{

    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

}
