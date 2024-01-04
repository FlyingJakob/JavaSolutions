package org.Lektion_03_01_2024.UserSystem;

import org.Lektion_03_01_2024.Book;
import org.Lektion_03_01_2024.LibraryCatalog;

import java.util.List;
import java.util.Scanner;

public class AdminUser extends User {


    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public void UserMenu() {
        Scanner scanner = new Scanner(System.in);
        LibraryCatalog libraryCatalog = new LibraryCatalog("Catalog.txt",true);

        System.out.println("(1) Add book");
        System.out.println("(2) Delete book");
        System.out.println("(3) Find book");


        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                System.out.println("-----------Adding book-----------");
                System.out.println("Title:");
                String title = scanner.nextLine();
                System.out.println("Author:");
                String author = scanner.nextLine();
                System.out.println("ISBN:");
                String isbn = scanner.nextLine();
                System.out.println("Is Available:");
                boolean isAvailable = Boolean.parseBoolean(scanner.nextLine());
                Book book = new Book(title,author,isbn,isAvailable);
                libraryCatalog.AddBook(book);
                break;
            case 2:
                System.out.println("-----------Removing book-----------");
                System.out.println("ISBN:");
                String isbn2 = scanner.nextLine();
                libraryCatalog.RemoveBook(isbn2);
                break;
            case 3:
                System.out.println("-----------Finding book-----------");
                System.out.println("Search key:");
                String searchKey = scanner.nextLine();
                System.out.println("Key:");
                String key = scanner.nextLine();

                List<Book> bookResults = null;

                switch (searchKey){
                    case "Title":
                        bookResults = libraryCatalog.FindBookByTitle(key);
                        break;
                    case "Author":
                        bookResults = libraryCatalog.FindBooksByAuthor(key);
                        break;
                    case "ISBN":
                        bookResults = libraryCatalog.FindBookByISBN(key);
                        break;
                    case "IsAvailable":
                        bookResults = libraryCatalog.FindBooksByAvailability(Boolean.parseBoolean(key));
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
        return "Logged in as Admin";
    }
}
