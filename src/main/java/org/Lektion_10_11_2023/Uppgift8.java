package org.Lektion_10_11_2023;

public class Uppgift8 {


    public static void main(String[] args) {
        method(0);
    }

    public static void method(int a){
        System.out.println(a);
        method("Jakob");
    }

    public static void method(String text){
        System.out.println(text);
        System.out.println(method(5,2));
    }

    public static double method(double a,double b){
        return a+b;
    }

}
