package org.Lektion_06_11_2023.Genomgång;

public class Car extends Vehicle implements Drivable,Flyable{

    @Override
    public void startEngine() {
        System.out.println("The car is starting");
    }

    @Override
    public void honk() {
        super.honk();
        System.out.println("car honks");
    }

    @Override
    public void drive() {
        System.out.println("The car is driving");
    }

    @Override
    public void fly() {
        System.out.println("the car is flying");
    }
}
