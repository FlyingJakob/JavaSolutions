package org.Lektion_03_01_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryCatalog {
    List<Book> bookList;
    String fileName;

    public List<Book> getBookList() {
        return bookList;
    }

    public LibraryCatalog(String fileName, boolean loadCatalog){
        this.fileName = fileName;
        if (loadCatalog){
            this.bookList = LoadCatalog();
        }else{
            this.bookList = new ArrayList<>();
        }
    }

    public void SaveCatalog(){
        try {
            FileWriter myWriter = new FileWriter(fileName);
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
        List<Book> list = new ArrayList<>();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split(";");
                Book book = new Book(parts[0],parts[1],parts[2],Boolean.parseBoolean(parts[3]));
                list.add(book);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return list;
    }


    public void AddBook(Book book){

        if (FindBookByISBN(book.getISBN()) != null){
            System.out.println("Book already exists");
            return;
        }

        bookList.add(book);
        SaveCatalog();
    }

    public void RemoveBook(Book book){
        bookList.remove(book);
        SaveCatalog();
    }

    public void RemoveBook(String isbn){
        Book bookToRemove = FindBookByISBN(isbn);
        RemoveBook(bookToRemove);
    }


    public Book FindBookByTitle(String title){
        for (Book book: bookList) {
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public Book FindBookByISBN(String ISBN){
        for (Book book: bookList) {

            if (book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }

    public List<Book> FindBooksByAuthor(String author){
        List<Book> books = new ArrayList<>();
        for (Book book: bookList) {
            if (book.getAuthor().equals(author)){
                books.add(book);
            }
        }
        return books;
    }

    public List<Book> FindBooksByAvailability(boolean isAvailable){
        List<Book> books = new ArrayList<>();
        for (Book book: bookList) {
            if (book.isAvailable() == isAvailable){
                books.add(book);
            }
        }
        return books;
    }




}
