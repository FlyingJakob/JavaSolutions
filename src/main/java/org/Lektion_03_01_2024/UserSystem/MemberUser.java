package org.Lektion_03_01_2024.UserSystem;

import org.Lektion_03_01_2024.Book;
import org.Lektion_03_01_2024.LibraryCatalog;

import java.util.List;
import java.util.Scanner;

public class MemberUser extends User{
    public MemberUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void UserMenu() {
        Scanner scanner = new Scanner(System.in);

        LibraryCatalog libraryCatalog = new LibraryCatalog("Catalog.txt",true);

        System.out.println("(1) Find book");


        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                System.out.println("-----------Finding book-----------");
                System.out.println("Search key:");
                String searchKey = scanner.nextLine();
                System.out.println("Key:");
                String key = scanner.nextLine();

                List<Book> bookResults = null;

                switch (searchKey){
                    case "Title":
                        bookResults = libraryCatalog.FindBookByTitle(searchKey);
                        break;
                    case "Author":
                        bookResults = libraryCatalog.FindBooksByAuthor(searchKey);
                        break;
                    case "ISBN":
                        bookResults = libraryCatalog.FindBookByISBN(searchKey);
                        break;
                    case "IsAvailable":
                        bookResults = libraryCatalog.FindBooksByAvailability(Boolean.parseBoolean(searchKey));
                        break;
                }

                if (bookResults == null){
                    System.out.println("Found no book with "+searchKey+" "+key);
                    break;
                }

                if (bookResults.size()==0){
                    System.out.println("Found no book with "+searchKey+" "+key);
                }else{
                    System.out.println("Found the following books:");
                    for (int i = 0; i < bookResults.size(); i++) {
                        System.out.println(bookResults.get(i).toString());
                    }
                }
                break;
        }
    }

    @Override
    public String GetGreeting() {
        return "Logged in as Member";
    }
}
