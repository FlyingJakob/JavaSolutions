package org.Lektion_03_01_2024;

import org.Lektion_03_01_2024.UserSystem.AdminUser;
import org.Lektion_03_01_2024.UserSystem.User;

import java.util.Scanner;

public class LibrarySystem {
    static User loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if (loggedInUser!=null){
            System.out.println(loggedInUser.GetGreeting());

            loggedInUser.UserMenu();
        }


    }

}
