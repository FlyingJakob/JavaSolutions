package org.Lektion_07_11_2023;

import java.util.ArrayList;

public class Uppgift4 {

    public static void main(String[] args) {
        ArrayList<Shape> myShapeList = new ArrayList<>();

        myShapeList.add(new Square(1));
        myShapeList.add(new Circle(1));
        myShapeList.add(new Triangle(1,1));

        for (int i = 0; i < myShapeList.size(); i++) {


            if (myShapeList.get(i) instanceof Resizable){
                System.out.println("resizable");
                ((Resizable)myShapeList.get(i)).resize(2);
            }else {
                System.out.println("Not resizable");
            }

            myShapeList.get(i).printArea();
        }

    }
}
