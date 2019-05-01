package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;
import java.lang.Integer;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After

    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass

    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass

    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> theList = new ArrayList<>();

        OddNumbersExterminator show = new OddNumbersExterminator();
        List<Integer> result = show.exterminate(theList);

         Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(10);
        theList.add(2);
        theList.add(3);
        theList.add(6);
        theList.add(38);
        theList.add(9);
        OddNumbersExterminator show = new OddNumbersExterminator();
        List<Integer> result = show.exterminate(theList);

        Assert.assertFalse(result.isEmpty());
        Assert.assertEquals(4,result.size());
        Assert.assertEquals( 10,result.get(0).longValue());
        Assert.assertEquals( 2,result.get(1).longValue());
        Assert.assertEquals( 6,result.get(2).longValue());
        Assert.assertEquals( 38,result.get(3).longValue());
    }
}


