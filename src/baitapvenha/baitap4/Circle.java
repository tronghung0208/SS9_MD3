package baitapvenha.baitap4;

public class Circle extends Shape {
private double r;
 private static final double PI=3.14;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(r,2);
    }

    @Override
    public void display() {
        super.display();
    }
}
