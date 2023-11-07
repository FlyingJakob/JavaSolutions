package org.Lektion_06_11_2023.Övningar;

public class Uppgift12 {

    public static void main(String[] args) {
        Animal myDog = new Dog("Kalle",5,"Dog","Tax");
        Animal myCat = new Cat("Katt",4,"Cat");


        cuddleIfPet(myDog);

    }

    public static void cuddleIfPet(Animal animal){

        if (animal instanceof Pet){
            ((Pet)animal).cuddle();
        }else {
            System.out.println("The animal is not a pet");
        }

    }

    public static void checkAnimal(Animal animal){
        if (animal instanceof Dog){
            System.out.println("Animal is a dog");
        } else if (animal instanceof Cat) {
            System.out.println("Animal is a cat");
        }
    }


}
