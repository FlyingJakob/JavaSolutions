package org.Lektion_20_11_2023;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Uppgift2 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("test.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Java är roligt!\nJag lär mig filhantering.\nSnart kan jag spara data lokalt.");

            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Something went wrong");
        }

    }
}
