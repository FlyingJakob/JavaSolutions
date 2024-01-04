package org.Lektion_03_01_2024;

import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryCatalog libraryCatalog = new LibraryCatalog("Catalog.txt",true);

        System.out.println("(1) Add book");
        System.out.println("(2) Delete book");
        System.out.println("(3) Find book by Title");
        System.out.println("(4) Find book by Author");
        System.out.println("(5) Find book by ISBN");
        System.out.println("(6) Find book by Availability");

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

}
