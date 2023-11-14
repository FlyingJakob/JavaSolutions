package org.Lektion_14_11_2023;

public class Uppgift2 {
    public static void main(String[] args) {

        int[] array = {1,2,9,4000,5,6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        System.out.println(sum/ array.length);


    }
}
