package org.Lektion_07_11_2023;

public class Uppgift9 {
    public static void main(String[] args) {

        Triangle mySquare = new Triangle(2,1);

        printShapeType(mySquare);

    }

    public static void printShapeType(Shape shape){

        if (shape instanceof Square){
            System.out.println("The shape is a square");
        }

        if (shape instanceof Circle){
            System.out.println("The shape is circle");
        }

        if (shape instanceof Triangle){
            System.out.println("The shape is triangle");
        }


    }
}
