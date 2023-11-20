package org.Lektion_20_11_2023;

import java.io.File;
import java.io.IOException;

public class Uppgift1 {

    public static void main(String[] args) {

        try{
            File file = new File("practice.txt");

            if (file.exists()){
                System.out.println("File already exists");
            }else {
                file.createNewFile();
            }
        }catch (IOException e){
            System.out.println("Something went wrong!");
        }


    }
}
