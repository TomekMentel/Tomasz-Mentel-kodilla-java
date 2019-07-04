package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void taskPaintingTest() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
    }

    @Test
    public void taskShoppingTest() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
    }

    @Test
    public void taskDrivningTest() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivning = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopinig", drivning.getTaskName());
    }
}