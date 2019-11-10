package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistic;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistic;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistic statistic = new Statistic();
        return statistic.averagePublicationYear(books);
    }

    @Override
    public int medianaPublicationYear(Map<BookSignature, Book> books) {
        Statistic statistic = new Statistic();
        return statistic.medianaPublicationYear(books);
    }
}
