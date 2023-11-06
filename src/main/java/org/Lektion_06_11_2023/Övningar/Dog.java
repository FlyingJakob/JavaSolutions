package org.Lektion_06_11_2023.Övningar;

import org.Lektion_06_11_2023.Övningar.Animal;

public class Dog extends Animal implements Pet {

    public String breed;

    public Dog(String name,int age,String species,String breed) {
        super(name,age,species);
        this.breed = breed;
    }


    @Override
    public void move() {
        System.out.println("The dog is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }


    @Override
    public void cuddle() {
        System.out.println("Cuddle with the dog");
    }
}
