package org.Lektion_07_11_2023;

public class Circle extends Shape implements Resizable{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void printArea() {
        System.out.println("Circle area = "+Math.PI*radius*radius);
    }

    @Override
    public String printInformation() {
        return "This circle has a radius of "+radius;
    }

    @Override
    public void resize(double factor) {
        radius = radius*factor;
    }
}
