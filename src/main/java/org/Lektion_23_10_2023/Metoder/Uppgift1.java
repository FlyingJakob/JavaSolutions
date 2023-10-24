package org.Lektion_23_10_2023.Metoder;

public class Uppgift1 {
    public static void main(String[] args) {
        //System.out.println(getProduct(5,5));

        //String repeatedString = repeat("Jakob",5);
        //System.out.println(repeatedString);
        //JakobJakobJakobJakobJakob

        //checkPositive(-10);
        System.out.println(isVowel("A"));
    }


    public static boolean isVowel(String letter){
        String vowels = "AEUIO";
        return vowels.contains(letter);
    }

    public static int round(float a){
       return Math.round(a);
    }


    public static void checkPositive(int a){
        if (a<0){
            System.out.println("Negative");
            return;
        }

        System.out.println("Positive");

    }

    public static String repeat(String text,int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result+=text;
        }

        return result;
    }


    public static int getProduct(int a,int b){
        int c = a*b;
        return c;
    }
}
