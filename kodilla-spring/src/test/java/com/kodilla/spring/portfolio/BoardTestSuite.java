package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addInProgressList("In Progress");
        board.addDoneDoList("Done");
        board.addToDoList("ToDo");

        String inProgress = board.getInProgressList(0);
        String done = board.getDoneList(0);
        String toDo = board.getToDoList(0);
        //Then
        Assert.assertEquals(inProgress, "In Progress");
        Assert.assertEquals(done, "Done");
        Assert.assertEquals(toDo, "ToDo");
    }
}
