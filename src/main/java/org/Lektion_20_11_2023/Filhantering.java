package org.Lektion_20_11_2023;

import java.io.File;

public class Filhantering {
    public static void main(String[] args) {
        File myFile = new File("example.txt");
        System.out.println(myFile.exists());

    }

}
