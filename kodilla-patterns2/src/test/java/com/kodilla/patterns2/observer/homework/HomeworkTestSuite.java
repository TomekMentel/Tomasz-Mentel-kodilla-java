package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void MentorTestUpdate() {
        //Given
        Student janKowalski = new Student("Jan Kowalski");
        Student katarzynaFigura = new Student("Katarzyna Figura");
        Student mirekMalczewski = new Student("Mirek Malczewski");
        Student alicjaWisniewska = new Student("Alicja Wisniewska");

        Mentor johnSmith = new Mentor("John Smith");
        Mentor aliAhmed = new Mentor("Ali Ahmed");

        janKowalski.registerObserver(johnSmith);
        katarzynaFigura.registerObserver(johnSmith);
        mirekMalczewski.registerObserver(aliAhmed);
        alicjaWisniewska.registerObserver(aliAhmed);
        //When
        janKowalski.addTask("Quarry");
        janKowalski.addTask("ArrayList");
        janKowalski.addTask("For Each");
        katarzynaFigura.addTask("For loop");
        mirekMalczewski.addTask("HashMap");
        alicjaWisniewska.addTask("LinkedList");
        //Then
        Assert.assertEquals(aliAhmed.getUpdateCount(), 2);
        Assert.assertEquals(johnSmith.getUpdateCount(), 4);
    }
}
