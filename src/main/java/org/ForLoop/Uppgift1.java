package org.ForLoop;

import java.util.Scanner;

public class Uppgift1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double sum = 0;

        for (double i = 1; i <= N; i++) {
            System.out.println("1 / "+i);
            sum+= 1/i;
        }

        System.out.println(sum);


    }
}
