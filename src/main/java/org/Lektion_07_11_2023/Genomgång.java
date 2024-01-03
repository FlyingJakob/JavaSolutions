package org.Lektion_07_11_2023;

public class Genomgång {

    public static void main(String[] args) {
        printInformation(new Circle(1));
        printInformation(new Triangle(1,1));
    }

    public static void printInformation(Square square){
        square.printInformation();
    }

    public static void printInformation(Triangle triangle){
        triangle.printInformation();
    }

    public static void printInformation(Circle circle){
        circle.printInformation();
    }

}
