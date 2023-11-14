package org.Lektion_07_11_2023;

public class Calculator {

    public double add(int a,double b){
        return a+b;
    }

    public int add(double a,int b){
        return (int) (a+b);
    }




    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //calculator.add(1,1);
        //calculator.add(1.5,1.2);
    }



}
