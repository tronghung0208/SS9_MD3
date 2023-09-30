package baitapvenha.baitap4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 4);
        circle.display();
        System.out.println("Diện tích tính hình tròn: "+circle.getArea());
        Rectangle rectangle = new Rectangle("Blue", 4, 5);
        rectangle.display();
        System.out.println(rectangle.getArea());
    }
}
