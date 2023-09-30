package baitapvenha.baitap4;

public class Rectangle extends Shape{
private double with;
private  double height;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public Rectangle(String color, double with, double height) {
        super(color);
        this.with = with;
        this.height = height;
    }

    @Override
    public double getArea() {
        return with*height;
    }

    @Override
    public void display() {
        super.display();
    }
}
