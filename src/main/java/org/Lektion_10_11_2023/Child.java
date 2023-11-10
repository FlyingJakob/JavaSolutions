package org.Lektion_10_11_2023;

public class Child extends Parent{


    public void printText(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Child child = new Child();

        child.printText("Jakob",10000);
    }

}
