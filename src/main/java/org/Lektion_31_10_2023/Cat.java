package org.Lektion_31_10_2023;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("MJAU");
    }
}
