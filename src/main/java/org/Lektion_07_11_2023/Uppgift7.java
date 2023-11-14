package org.Lektion_07_11_2023;

public class Uppgift7 {

    public static void main(String[] args) {
        Shape mySquare = new Square(1);
        Shape myCircle = new Circle(1);

        System.out.println(mySquare.printInformation());
        System.out.println(myCircle.printInformation());
    }
}
