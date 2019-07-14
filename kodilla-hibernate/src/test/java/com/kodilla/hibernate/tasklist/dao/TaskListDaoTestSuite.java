package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Painting the wall";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Andrzej Kowalski", DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        String name = taskList.getListName();
        List<TaskList> readTask = taskListDao.findByListName(name);
        Assert.assertEquals("Andrzej Kowalski", readTask.get(0).getListName());
        //CleanUp
        taskListDao.delete(taskList);
    }
}
