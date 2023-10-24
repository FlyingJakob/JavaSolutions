package org.Lektion_23_10_2023.Metoder;

public class Genomgång {
    public static void main(String[] args) {
        //sayHelloTo("Jakob");
        //sayHelloTo("Kalle");
        printPositiveNumber(-10);
    }

    public static void sayHelloTo(String namn){
        System.out.println("Hello "+namn+"!");
    }




    public static void printHello(){
        System.out.println("Hello!");
    }


    public static void printPositiveNumber(int number) {

        if (number < 0) {
            System.out.println("Inte ett positivt tal!");
            return;
        }

        System.out.println("Positivt tal: " + number);
    }


}
