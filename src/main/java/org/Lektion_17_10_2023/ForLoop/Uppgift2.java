package org.Lektion_17_10_2023.ForLoop;

public class Uppgift2 {

    public static void main(String[] args) {
        int N = 5;

        for (int x = 1; x <= N; x++) {
            double square = Math.pow(x,2);
            double cube = Math.pow(x,3);

            System.out.println("X = "+x+" x^2 = "+square+" x^3 = "+cube);

        }

    }
}
