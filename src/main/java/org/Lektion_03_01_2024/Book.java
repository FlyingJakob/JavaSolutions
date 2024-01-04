package org.Lektion_03_01_2024;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }

    private boolean isAvailable;

    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book)obj;

        if (book.getAuthor().equals(this.getAuthor()) && book.getISBN().equals(this.getISBN()) && book.getTitle().equals(this.getTitle())){
            return true;
        }else {
            return false;
        }
    }
}
