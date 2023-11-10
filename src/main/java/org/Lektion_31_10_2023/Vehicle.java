package org.Lektion_31_10_2023;

public abstract class Vehicle {

    public String brand;

    public abstract void move();

    public void honk(){
        System.out.println("HONK");
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();
        car.honk();
    }

}
