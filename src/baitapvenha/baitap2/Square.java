package baitapvenha.baitap2;

public class Square implements Colorable {
private double size;
private boolean colorable;

    public Square() {
    }

    public Square(double size, boolean colorable) {
        this.size = size;
        this.colorable = colorable;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public double getArea(){
        return size*size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public void display(){
        System.out.println("Diện tích hình vuông có cạnh "+size+" là: "+ getArea());
    }
}
