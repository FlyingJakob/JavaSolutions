package org.While;

public class Uppgift2 {

    public static void main(String[] args) {


        // 5 -> 16 -> 8 -> 4 -> 2 -> 1

        int N = 100;

        for (int i = 1; i < N; i++) {

            int temp = i;
            int counter = 0;
            while(temp!=1){
                counter++;
                if (temp%2==0){
                    temp/=2;
                }else {
                    temp = temp*3+1;
                }
            }

            System.out.println("i = "+i+" iterations = "+counter);

        }



    }

}
