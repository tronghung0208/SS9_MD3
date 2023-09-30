package baitapvenha.baitap1;

public class Square implements Resizeable {
    private double size;
    private double percent;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Cạnh tăng lên "+ percent+"% là: "+size+ size*percent/100);
        System.out.println("Diện tích hình vuông tăng lên "+ percent+"% là: "+size*size+size*size*percent/100);
    }


}
