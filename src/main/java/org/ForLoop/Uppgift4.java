package org.ForLoop;

public class Uppgift4 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            int tal = i;

            boolean isPrime = true;

            for (int j = 2; j < tal; j++) {
                if (tal%j==0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(tal);

            }

        }




    }
}
