package org.Lektion_07_11_2023;

import java.util.Scanner;

public class Uppgift1 {
    public static void main(String[] args) {



        Shape[] myShapes = {new Square(1),new Circle(1),new Triangle(1,1)};

        for (int i = 0; i < myShapes.length; i++) {
            myShapes[i].printArea();
        }

    }
}
