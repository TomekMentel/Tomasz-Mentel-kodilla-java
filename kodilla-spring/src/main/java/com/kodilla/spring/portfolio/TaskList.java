package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public String getTasks(int number) {
        return tasks.get(number);
    }

    public void addTask(String task) {
        tasks.add(task);
    }
}