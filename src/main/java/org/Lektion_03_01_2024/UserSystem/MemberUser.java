package org.Lektion_03_01_2024.UserSystem;

import org.Lektion_03_01_2024.Book;
import org.Lektion_03_01_2024.LibraryCatalog;

import java.util.Scanner;

public class MemberUser extends User{
    public MemberUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void UserMenu() {
        Scanner scanner = new Scanner(System.in);

        LibraryCatalog libraryCatalog = new LibraryCatalog("Catalog.txt",true);

        System.out.println("(1) Find book by Title");
        System.out.println("(2) Find book by Author");
        System.out.println("(3) Find book by ISBN");
        System.out.println("(4) Find book by Availability");

        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                System.out.println("-----------Finding book-----------");
                System.out.println("Title:");
                String title2 = scanner.nextLine();
                Book book2 = libraryCatalog.FindBookByTitle(title2);
                if (book2 == null){
                    System.out.println("Found no book named "+title2);
                }else{
                    System.out.println(book2);
                }
                break;
        }
    }

    @Override
    public String GetGreeting() {
        return "Logged in as Member";
    }
}
