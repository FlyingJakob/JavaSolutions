package org.Lektion_20_11_2023;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SkrivaData {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/Users/jakobforsbacka/Desktop/example.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
