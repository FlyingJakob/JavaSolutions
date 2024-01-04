package org.Lektion_03_01_2024;

import org.Lektion_03_01_2024.UserSystem.AdminUser;
import org.Lektion_03_01_2024.UserSystem.User;
import org.Lektion_03_01_2024.UserSystem.UserSystem;

import java.util.Scanner;

public class LibrarySystem {
    static User loggedInUser = null;
    static UserSystem userSystem;


    public static void main(String[] args) {

        userSystem = new UserSystem();

        startMenu();

        if (loggedInUser!=null){
            System.out.println(loggedInUser.GetGreeting());

            while(true){
                loggedInUser.UserMenu();
            }

        }
    }

    private static void startMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1) Login");
        System.out.println("(2) Register");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                if (loginUserMenu()){
                    System.out.println("Logged in");
                }
                break;
            case 2:
                if (registerUserMenu()){
                    System.out.println("Registered user");
                }
                break;
        }
    }


    public static boolean loginUserMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("-----Login-----");
            System.out.println("Username : ");
            String username = scanner.nextLine();
            System.out.println("Password : ");
            String password = scanner.nextLine();

            User user = userSystem.login(username,password);

            if (user!= null){
                loggedInUser = user;
                return true;
            }else {
                System.out.println("Login failed");
            }

        }
    }

    public static boolean registerUserMenu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("-----Register-----");
            System.out.println("Username : ");
            String username = scanner.nextLine();
            System.out.println("Password : ");
            String password = scanner.nextLine();

            System.out.println("isAdmin : ");
            Boolean isAdmin = Boolean.valueOf(scanner.nextLine());

            User user = userSystem.register(username,password,isAdmin);

            if (user!= null){
                loggedInUser = user;
                return true;
            }else {
                System.out.println("Register failed");
            }

        }
    }

}
