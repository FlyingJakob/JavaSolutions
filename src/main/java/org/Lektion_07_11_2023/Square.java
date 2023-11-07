package org.Lektion_07_11_2023;

public class Square extends Shape implements Resizable{
    public double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void resize(double factor) {
        side=side*factor;
    }

    @Override
    public void printArea() {
        System.out.println("Square area = "+side*side);
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
