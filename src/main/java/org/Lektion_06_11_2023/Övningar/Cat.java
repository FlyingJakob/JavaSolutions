package org.Lektion_06_11_2023.Övningar;

public class Cat extends Animal implements Pet{



    public Cat(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void makeSound() {
        System.out.println("MEUUWW");
    }

    @Override
    public void move() {
        System.out.println("The cat is moving");
    }

    @Override
    public void cuddle() {
        System.out.println("Cuddle with the cat");
    }
}
