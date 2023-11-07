package org.Lektion_06_11_2023.Genomgång;

public class Genomgång {


    public static void main(String[] args) {

        Vehicle myTruck = new Truck();
        Vehicle myCar = new Car();

        Vehicle[] myVehicles = {myTruck,myCar};

        for (int i = 0; i < myVehicles.length; i++) {
            myVehicles[i].startEngine();
        }

    }
}
