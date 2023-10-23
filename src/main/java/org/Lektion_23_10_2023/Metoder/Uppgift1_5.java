package org.Lektion_23_10_2023.Metoder;

public class Uppgift1_5 {

    public static void main(String[] args) {
        printHello();
        sayHelloTo("Jakob");

        System.out.println(getFullName("Jakob","Forsbacka"));

        int c = sum(1,5);

        System.out.println(c);
    }

    public static void printHello(){
        System.out.println("Hello java!");
    }

    public static void sayHelloTo(String name){
        System.out.println("Hej "+name);
    }

    public static int sum(int a,int b){
        int c = a+b;
        return c;
    }

    public static String getFullName(String förnamn,String efternamn) {
        return förnamn+" "+efternamn;
    }

}
