package baitapvenha.baitap1;

public class Rectangle implements Resizeable{
private double percent;
private  double with;
private double height;



    public Rectangle() {
    }

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        System.out.println("chiều rộng tăng "+percent+"% là: "+with+with*percent/100);
        System.out.println("Chiều dài tăng "+percent+"% là: "+height+height*percent/100);

        System.out.println("Diện tích tăng "+percent+"% là: "+ with*height+with*height*percent/100);
    }
}
