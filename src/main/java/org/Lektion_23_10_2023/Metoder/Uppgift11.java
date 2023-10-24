package org.Lektion_23_10_2023.Metoder;

public class Uppgift11 {
    public static void main(String[] args) {
        //System.out.println(getMin(100,2,3));
        //A();
        //double area = getArea(2);
        //System.out.println(area);
        //System.out.println(getFullName("Forsbacka","Jakob"));
        printFirstNumbers(10);
    }

    public static void printFirstNumbers(int n){

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


    }


    public static String getFullName(String lastName,String firstName){
        String formattedName = lastName+", "+firstName;
        return formattedName;
    }


    public static int getMin(int a, int b, int c){



        if (a < b && a < c) {
            return a;
        } else

        if (b < a && b < c) {
            return b;
        }

        return c;
    }

    public static double getArea(double r){
        double area = Math.PI*r*r;
        return area;
    }


    public static void A(){
        B();
        System.out.println("Nu är vi i A igen");
    }

    public static void B(){
        System.out.println("Kallad från metod A");
    }

}
