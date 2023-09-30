package baitapvenha.baitap1;

public class Circle implements Resizeable{
    private double r;
    private double percent;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Bán kính tăng lên " +percent+"% là: "+ r+r*percent/100);

        System.out.println("Diện tích hình tròn tăng lên "+ percent+ "% là "+ Math.PI*Math.pow(r,2)+Math.PI*Math.pow(r,2)*percent/100);
    }
}
