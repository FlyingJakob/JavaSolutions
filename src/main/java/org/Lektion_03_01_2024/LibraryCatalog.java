package org.Lektion_03_01_2024;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    List<Book> bookList;

    public LibraryCatalog(){
        this.bookList = LoadCatalog();

    }

    public static void main(String[] args) {
        Book book1 = new Book("jakobs bok","jakob","1234",true);
        Book book2 = new Book("jakobs andra bok","jakob","23423",true);
        Book book3 = new Book("jakobs tredje bok","jakob","1253",true);

        LibraryCatalog libraryCatalog = new LibraryCatalog();
        libraryCatalog.AddBook(book1);
        libraryCatalog.AddBook(book2);
        libraryCatalog.AddBook(book3);

    }

    public void SaveCatalog(){
        try {
            FileWriter myWriter = new FileWriter("Catalog.txt");
            for (Book book: bookList) {
                myWriter.write(book.getTitle()+";"+book.getAuthor()+";"+book.getISBN()+";"+book.isAvailable()+"\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Book> LoadCatalog(){
        return null;
    }


    public void AddBook(Book book){
        bookList.add(book);
        SaveCatalog();
    }

    public void RemoveBook(Book book){
        bookList.remove(book);
        SaveCatalog();
    }

    public Book FindBookByTitle(String title){

        for (Book book: bookList) {
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }




}
