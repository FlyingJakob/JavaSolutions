package org.Lektion_23_10_2023.Metoder;

public class Uppgift6_10 {

    public static void main(String[] args) {
        //printQuote();
        //getMax(5,8);
        //printData("hej");
        //printData(1);
        //repeat(5,"Jakob");
        System.out.println(isEven(10));
    }


    public static boolean isEven(int number){
        return number%2==0;
    }

    public static void repeat(int n,String name){
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" : "+name);
        }
    }


    public static void printData(int data){
        System.out.println(data);
    }

    public static void printData(String data){
        System.out.println(data);
    }

    public static void printQuote(){
        System.out.println("Jag gillar mat!");
    }

    public static void getMax(int a,int b){
        if (a>b){
            System.out.println(a);
        }else if (a<b){
            System.out.println(b);
        } else {
            System.out.println("They are equal");
        }
    }

}
