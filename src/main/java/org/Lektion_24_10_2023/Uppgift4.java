package org.Lektion_24_10_2023;

public class Uppgift4 {

    public static void main(String[] args) {
        double avg = getAverage(0,1);
        System.out.println(avg);
    }
    public static double getAverage(int... numbers){

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        return sum / numbers.length;
    }
}
