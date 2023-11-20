package org.Lektion_14_11_2023;

public class Calculator {

    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiply(int a,int b){
        return a*b;
    }

    public double divide(int a,int b){
        if (b==0){
            throw new ArithmeticException();
        }
        return (double)a/(double)b;
    }
}
