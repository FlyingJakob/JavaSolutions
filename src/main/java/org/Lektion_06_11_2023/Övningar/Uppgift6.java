package org.Lektion_06_11_2023.Övningar;

public class Uppgift6 {

    public static void main(String[] args) {

        Animal myDog = new Poodle("Kalle",5,"Dog","Tax");

        Animal myCat = new Cat("Katt",4,"Cat");

        Animal[] animalArray = {myDog,myCat};

        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i].move();
            if (animalArray[i] instanceof Pet){
                ((Pet) animalArray[i]).cuddle();
            }
        }

    }
}
