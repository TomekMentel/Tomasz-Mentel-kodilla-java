package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage() {
        int[] numbers = {3, 5, 3, 5, 4, 2, 6, 2, 4, 4, 3, 4, 2, 6, 4, 3, 7, 3, 6, 1};

        double average = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(3.85, average, 0.1);

    }
}
