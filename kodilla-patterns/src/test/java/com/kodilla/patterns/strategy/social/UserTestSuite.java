package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new ZGeneration("Adam Kowalski");
        User john = new YGeneration("John Walker");
        User jane = new Millenials("Jane Milewski");
        //When
        String adamUsing = adam.sharePost();
        System.out.println("Adam Kowalski " + adamUsing);
        String johnUsing = john.sharePost();
        System.out.println("John Walker " + johnUsing);
        String janeUsing = jane.sharePost();
        System.out.println("Jane Milewski " + janeUsing);
        //Then
        Assert.assertEquals("SnapchatPublisher", adamUsing);
        Assert.assertEquals("TwitterPublisher", johnUsing);
        Assert.assertEquals("FacebookPublisher", janeUsing);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User adam = new ZGeneration("Adam Kowalski");
        //When
        String adamUsing = adam.sharePost();
        System.out.println("Adam Kowalski" + adamUsing);
        adam = new YGeneration("Adam Kowalski");
        adamUsing = adam.sharePost();
        System.out.println("Adam Kowalski" + adamUsing);
        Assert.assertEquals("TwitterPublisher", adamUsing);
    }
}
