package org.Lektion_24_10_2023;

public class Uppgift1 {

    public static void main(String[] args) {
        calculateArea(1,2,true);
    }

    public static double calculateArea(double r){
        return Math.PI*r*r;
    }

    public static double calculateArea(double l,double h){
        return l*h;
    }

    public static double calculateArea(double l,double h,boolean isTriangle){
        return l*h/2;
    }



}
