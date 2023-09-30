package baitapvenha.baitap2;

public class Main {
    public static void main(String[] args) {
        Square[] square=new Square[4];
        Square square1 =new Square(5,true);
        Square square2 =new Square(6,true);
        Square square3 =new Square(7,false);
        Square square4 =new Square(8,true);
        square[0]=square1;
        square[1]=square2;
        square[2]=square3;
        square[3]=square4;

        for (Square sq:square){
            if (sq.isColorable()){
                sq.display();
                sq.howToColor();
            }
        }
    }
}
