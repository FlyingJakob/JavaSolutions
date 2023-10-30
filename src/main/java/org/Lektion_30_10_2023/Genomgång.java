package org.Lektion_30_10_2023;

import java.util.Scanner;

public class Genomgång {

    public static void main(String[] args) {

        Book myBook = new Book("Jakob","Jakobs bok");

        Book mySecondBook = new Book("Kalle","Jakobs andra bok");

        myBook.setTitle("Nya namnet på boken");


        System.out.println(myBook.getTitle());

    }
}
