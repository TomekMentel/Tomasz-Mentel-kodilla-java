package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Mroz Remigiusz", "Iluzjonista", 2010, "123");
        Book book2 = new Book("Olga Tokarczyk", "Bieguni", 2015, "321");
        Book book3 = new Book("Miler Kelsey", "Przyjaciele", 2008, "543");
        Book book4 = new Book("Snowden Edward", "Pamiec Absolutna", 2018, "576");
        Book book5 = new Book("Michalak Katarzyna", "Usmiech losu", 2000, "503");

        Set<Book> booksSet = new HashSet<>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(booksSet);
        //Then
        Assert.assertEquals(2010, median);
    }
}
