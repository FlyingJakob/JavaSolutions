package org.Lektion_09_10_2023;

import java.util.Scanner;

public class Uppgift14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String färg = scanner.nextLine();


        if (färg.equals("R")){
            System.out.println("Röd");
        } else if(färg.equals("G")){
            System.out.println("Green");
        } else if(färg.equals("B")){
            System.out.println("Blue");
        }



    }
}
