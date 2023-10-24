package org.Lektion_24_10_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Genomgång {


    public static String[] users = {"Jakob","Kalle"};


    public static void main(String[] args) {

        loginUser("Jakob","123");
    }

    public static void loginUser(String username,String password){
        boolean userExists = userExists(username);
    }

    public static boolean userExists(String username){

        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(username)){
                return true;
            }
        }
        return false;
    }

}
