package org.Lektion_07_11_2023;

public class Triangle extends Shape
{
    public double base;
    public double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void printArea() {
        System.out.println("Triangle area = "+base*height/2);
    }
}
