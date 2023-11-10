package org.Lektion_10_11_2023;

public class Uppgift1 {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(1,1,1));
    }


    public static void printNumbers(int... numbers){

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
