package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculateAdvStatisticsTestSuite {

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
    public void testCalculateAdvStatistics_PostCountZero() {

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        Assert.assertEquals(0, statisticsCalculate.getUsersNr(), 0.01);
        Assert.assertEquals(0, statisticsCalculate.getPostNr(), 0.01);
        Assert.assertEquals(0, statisticsCalculate.getCommentNr(), 0.01);
        Assert.assertEquals(0, statisticsCalculate.getCommentPerPost(), 0.01);
        Assert.assertEquals(0, statisticsCalculate.getPostPerUser(), 0.01);
        Assert.assertEquals(0, statisticsCalculate.getCommentPerUser(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics_PostMoreThenComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> theUsers = new ArrayList<>();
        String user = "user";
        int i = 0;

        while (i < 100) {
            theUsers.add(user);
            i++;
        }
        double postsCount = 1000;
        double commentsCount = 20;

        when(statisticsMock.usersNames()).thenReturn(theUsers);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsCalculate.getUsersNr(), 0.01);
        Assert.assertEquals(1000, statisticsCalculate.getPostNr(), 0.01);
        Assert.assertEquals(20, statisticsCalculate.getCommentNr(), 0.01);
        Assert.assertEquals(10, statisticsCalculate.getPostPerUser(), 0.01);
        Assert.assertEquals(0.2, statisticsCalculate.getCommentPerUser(), 0.01);
        Assert.assertEquals(0.02, statisticsCalculate.getCommentPerPost(), 0.01);

    }

    @Test
    public void testCalculateAdvStatistics_PostLessThenComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> theUser = new ArrayList<>();
        String user = "user";
        int i = 0;

        while (i < 100) {
            theUser.add(user);
            i++;
        }
        double postCount = 20;
        double commentsCount = 200;

        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        when(statisticsMock.usersNames()).thenReturn(theUser);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When

        statisticsCalculate.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsCalculate.getUsersNr(), 0.01);
        Assert.assertEquals(20, statisticsCalculate.getPostNr(), 0.01);
        Assert.assertEquals(200, statisticsCalculate.getCommentNr(), 0.01);
        Assert.assertEquals(0.2, statisticsCalculate.getPostPerUser(), 0.01);
        Assert.assertEquals(2, statisticsCalculate.getCommentPerUser(), 0.01);
        Assert.assertEquals(10, statisticsCalculate.getCommentPerPost(), 0.01);


    }
}


