package day9.Task2;

public class Rectangle extends Figure {

    int width;
    int length;

    public Rectangle(String color, int width, int length){
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public double area() {
        return this.length * this.width ;
    }
}
