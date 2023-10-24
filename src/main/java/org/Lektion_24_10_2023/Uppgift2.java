package org.Lektion_24_10_2023;

public class Uppgift2 {

    public static void main(String[] args) {
        count(10);
    }

    public static void count(int n){
        System.out.println(n);
        if (n>0){
            count(n-1);
        }

    }

}
