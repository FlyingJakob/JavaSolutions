package org.Lektion_20_11_2023;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Uppgift3 {

    public static void main(String[] args) {

        {
            try {
                FileReader fileReader = new FileReader("dfgfthgfgh.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line;
                while ((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }


            } catch (IOException e) {
                System.out.println("Something went wrong");
            }
        }
    }


}
