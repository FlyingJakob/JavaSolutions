package org.Lektion_31_10_2023;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal{


    public static void makeAnimalEat(Animal animal){
        animal.eat();
    }

    public static void makeAnimalsEat(Animal... animals){
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }


    @Override
    public void eat() {
        super.eat();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Animal myDog = new Dog("Kalle");
        Animal myCat = new Cat("Lisa");

        makeAnimalsEat(myDog,myCat);



    }

}
