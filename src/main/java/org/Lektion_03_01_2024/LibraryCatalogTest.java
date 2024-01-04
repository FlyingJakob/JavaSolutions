package org.Lektion_03_01_2024;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
