package org.While;

public class Uppgift1 {

    public static void main(String[] args) {

        double balance = 1000;
        double targetBalance = 2000;
        double factor = 5;

        int years = 0;

        while(balance<targetBalance){
            balance+= balance*factor/100;
            years++;
        }

        System.out.println(years);

    }
}
