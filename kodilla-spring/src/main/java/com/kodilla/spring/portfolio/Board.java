package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Board {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneDoList;

    public String getToDoList(int number) {
        return toDoList.getTasks(number);
    }

    public String getInProgressList(int number) {
        return inProgressList.getTasks(number);
    }

    public String getDoneList(int number) {
        return doneDoList.getTasks(number);
    }

    public void addToDoList(String task) {
        toDoList.addTask(task);
    }

    public void addInProgressList(String task) {
        inProgressList.addTask(task);
    }

    public void addDoneDoList(String task) {
        doneDoList.addTask(task);
    }
}
