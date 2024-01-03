package org.Lektion_20_11_2023;

import java.io.BufferedReader;
import java.io.FileReader;

public class Uppgift5 {

    public static void main(String[] args) {
        System.out.println(get_lines("practice.txt"));
    }


    public static int get_lines(String path){
        int lines = 0;

        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while(bufferedReader.readLine() != null){
                lines++;
            }

        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        return lines;


    }


}
