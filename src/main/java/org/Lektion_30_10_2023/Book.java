package org.Lektion_30_10_2023;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String author;
    private String title;

    public Book(String author,String title){
        this.author = author;
        this.title = title;
    }

    public void showInfo(){
        System.out.println(title);
        System.out.println(author);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public String getAuthor(){
        return author;
    }

    public static void main(String[] args) {


        Book book1 = new Book("Jakob","Jakobs äventyr");
        Book book2 = new Book("Kalle","Kalles äventyr");
        Book book3 = new Book("Lisa","Lisas äventyr");

        List<Book> minBokhylla = new ArrayList<>();

        minBokhylla.add(book1);
        minBokhylla.add(book2);
        minBokhylla.add(book3);



    }

}
