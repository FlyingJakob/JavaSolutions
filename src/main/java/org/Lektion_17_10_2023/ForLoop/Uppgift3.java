package org.Lektion_17_10_2023.ForLoop;

public class Uppgift3 {
    public static void main(String[] args) {

        String original = "Apa";

        original = original.toLowerCase();


        String reversed = "";


        StringBuilder output = new StringBuilder(original).reverse();

        reversed = output.toString();
        System.out.println(reversed);
        System.out.println(original);

        /*
        for (int i = original.length()-1; i >= 0 ; i--) {
            reversed+=original.charAt(i);
        }
        */



        if (original.equals(reversed)){
            System.out.println("Det var ett palindrom");
        }else{
            System.out.println("Det var inte ett palindrom");
        }




    }
}
