package org.Lektion_24_10_2023;

public class Uppgift5 {
    public static void main(String[] args) {
        printList(1,2,3,4,5,6,7,8,9);
        printList("Jakob","Hejsan","Kalle");
    }


    public static void printList(String... strings){
        for (String str:strings){
            System.out.println(str);
        }
    }
    public static void printList(int... numbers){
        for (int number:numbers){
            System.out.println(number);
        }
    }


}
