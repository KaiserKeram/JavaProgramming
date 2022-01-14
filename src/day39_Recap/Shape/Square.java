package day39_Recap.Shape;

public class Square extends Shape{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side){
        super("Square");
        setSide(side);
    }
}
