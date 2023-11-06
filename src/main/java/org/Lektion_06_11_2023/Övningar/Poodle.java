package org.Lektion_06_11_2023.Övningar;

public class Poodle extends Dog{
    public Poodle(String name, int age, String species, String breed) {
        super(name, age, species, breed);
    }


    public void performTrick(){
        System.out.println("Poodle does trick");
    }

    @Override
    public void move() {
        System.out.println("The poodle moves");
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}
