package org.Lektion_06_11_2023.Genomgång;

public class Dog extends Animal{

    public void sit(){
        System.out.println("The dog is sitting");
        name = "";
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }


}
