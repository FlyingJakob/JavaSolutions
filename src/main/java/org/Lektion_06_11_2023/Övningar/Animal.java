package org.Lektion_06_11_2023.Övningar;

public abstract class Animal{

    public String name;
    public int age;
    protected String species;


    public Animal(String name,int age,String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public final void look(){
        System.out.println("The animal is looking");
    }

    public abstract void move();

    public void makeSound(){
        System.out.println("The animal makes a sound!");
    }

}
