package org.Lektion_24_10_2023;

public class Uppgift3 {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int fib = fibonacci(i);
            System.out.print(" "+fib);
        }
    }


    public static int fibonacci(int n){
        if (n==0){
            return 0;
        } else if(n==1){
            return 1;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }
}
