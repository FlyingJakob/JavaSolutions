package org.Lektion_06_11_2023;

public class Vehicle {
    public String registration;

    public void startEngine(){
        System.out.println("The vehicle is starting");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.registration = "ABC-123";

        myCar.startEngine();
        myCar.drive();
        myCar.fly();

    }


}
