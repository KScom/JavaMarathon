package day6;

public class Motorbike {

    private String model;
    private String color;
    private int year;

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference (int inputYear){
        return Math.abs(this.year - inputYear);
    }


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
