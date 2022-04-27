package day9.Task2;

public class Triangle extends Figure{

    int length1;
    int length2;
    int length3;

    public Triangle(String color, int length1, int length2, int length3){
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        int p = (this.length1 + length2 + length3)/2;
        return Math.sqrt(p * (p - this.length1) * (p - this.length2) * (p - this.length3));
    }

    @Override
    public double perimeter() {
        return this.length1 + this.length2 + length3;
    }
}
