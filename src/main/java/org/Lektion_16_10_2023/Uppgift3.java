package org.Lektion_16_10_2023;

import java.util.Scanner;

public class Uppgift3 {



    public static void main(String[] args) {

        String vokaler = "AEOUÖÄÅY";

        int a = 10;

        double tal = 1/(double)a;


        Scanner scanner = new Scanner(System.in);

        String bokstav = scanner.nextLine();

        if (vokaler.contains(bokstav)){
            System.out.println("Vokal");
        }else {
            System.out.println("Konsonant");
        }

    }
}
