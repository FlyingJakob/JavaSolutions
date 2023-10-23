package org.Lektion_09_10_2023;

import java.util.Scanner;

public class Uppgift13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hej = 5;

        String operation = scanner.nextLine();

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (operation.equals("+")){
            System.out.println(a+b);
        } else if(operation.equals("-")){
            System.out.println(a-b);
        } else if(operation.equals("*")){
            System.out.println(a*b);
        } else if(operation.equals("/")){
            System.out.println(a/b);
        } else {
            System.out.println("Invalid operator");
        }








    }
}
