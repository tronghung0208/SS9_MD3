package baitapvenha.baitap1;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------HCN-----");
        Rectangle rectangle = new Rectangle(12, 15);
        rectangle.resize(10);
        System.out.println("----------Hình tròn-----------");
        Circle circle = new Circle(10);
        circle.resize(10);
        System.out.println("---------Hình vuông----------");
        Square square=new Square(10);
        square.resize(20);
    }
}
