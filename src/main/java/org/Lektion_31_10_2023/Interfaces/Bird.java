package org.Lektion_31_10_2023.Interfaces;

import org.Lektion_31_10_2023.Animal;

public class Bird extends Animal implements Flyable,Singable{


    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Fågeln flyger!");
    }

    @Override
    public void sing() {
        System.out.println("Pip");
    }

    public static void main(String[] args) {
        Animal myBird = new Bird("Pippi");


    }


}
