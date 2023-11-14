package org.Lektion_07_11_2023;

public class Square extends Shape implements Resizable{
    public double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public String printInformation() {
        return "This square has a side of "+side;
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
