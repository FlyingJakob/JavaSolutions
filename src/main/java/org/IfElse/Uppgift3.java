package org.IfElse;

import java.util.Scanner;

public class Uppgift3 {

    public static void main(String[] args) {



        while(true){

            Scanner scanner = new Scanner(System.in);


            int age = scanner.nextInt();

            if (age >= 18){
                System.out.println("Du får ta körkort");
            }else {
                System.out.println("Du får inte ta körkort");
            }
        }



    }
}
