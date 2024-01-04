package org.Lektion_03_01_2024;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryCatalogTest {

    @Test
    public void TestAddRemoveSaveLoad(){
        LibraryCatalog libraryCatalog = new LibraryCatalog("TestCatalog.txt",false);
        Book book1 = new Book("Jakobs bok","Jakob","123",true);
        Book book2 = new Book("Jakobs andra bok","Jakob","124",false);
        libraryCatalog.AddBook(book1);
        libraryCatalog.AddBook(book2);
        List<Book> books = libraryCatalog.getBookList();
        assertEquals(books.get(0),book1);
        assertEquals(books.get(1),book2);
        libraryCatalog.RemoveBook("123");
        assertEquals(books.get(0),book2);
        libraryCatalog = new LibraryCatalog("TestCatalog.txt",true);
        books = libraryCatalog.getBookList();
        assertEquals(books.get(0),book2);
    }

    @Test
    public void TestFindMethods(){
        LibraryCatalog libraryCatalog = new LibraryCatalog("TestCatalog.txt",false);
        Book book1 = new Book("Jakobs bok","Jakob","123",true);
        Book book2 = new Book("Jakobs andra bok","Jakob","124",false);
        Book book3 = new Book("Kalles bok","Kalle","125",true);
        libraryCatalog.AddBook(book1);
        libraryCatalog.AddBook(book2);
        libraryCatalog.AddBook(book3);

        assertEquals(libraryCatalog.FindBookByISBN("123"),book1);
        assertEquals(libraryCatalog.FindBookByISBN("124"),book2);

        assertEquals(libraryCatalog.FindBookByTitle("Jakobs bok"),book1);
        assertEquals(libraryCatalog.FindBookByTitle("Jakobs andra bok"),book2);

        List<Book> result1 = libraryCatalog.FindBooksByAuthor("Jakob");
        assertEquals(result1.size(),2);
        assertTrue(result1.contains(book1));
        assertTrue(result1.contains(book2));

        List<Book> result2 = libraryCatalog.FindBooksByAvailability(true);
        assertEquals(result2.size(),2);
        assertTrue(result2.contains(book1));
        assertTrue(result2.contains(book3));

    }

}
