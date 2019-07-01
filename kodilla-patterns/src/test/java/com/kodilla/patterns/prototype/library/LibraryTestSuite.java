package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Book book1 = new Book("Pan Kleks", "D.Bfdawfd", LocalDate.of(1985, 02, 12));
        Book book2 = new Book("Obcy", "R.Ddasf", LocalDate.of(1990, 10, 04));
        Book book3 = new Book("Godzilla", "W.Gdsfsd", LocalDate.of(2001, 02, 10));
        Book book4 = new Book("Alladyn", "K.Masdf", LocalDate.of(1970, 10, 01));

        Library library = new Library("Books 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library cloneBooks = null;
        try {
            cloneBooks = library.shallowCopy();
            cloneBooks.setName("Books 2 ");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedBook = null;
        try {
            deepClonedBook = library.deepCopy();
            deepClonedBook.setName("Books 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(cloneBooks);
        System.out.println(deepClonedBook);

        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneBooks.getBooks().size());
        Assert.assertEquals(4, deepClonedBook.getBooks().size());

        Assert.assertEquals(library.getBooks(), cloneBooks.getBooks());
        Assert.assertEquals(deepClonedBook.getBooks(), library.getBooks());
    }
}