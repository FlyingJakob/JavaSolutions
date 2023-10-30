package org.Lektion_30_10_2023;

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

}
