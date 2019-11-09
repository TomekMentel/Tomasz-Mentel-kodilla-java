package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable {
    private final Deque<String> task;
    private final List<Observer> observers;
    private final String name;

    public Student(String name) {
        task = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String tasks) {
        task.add(tasks);
        notifyObservers();
    }

    @Override
    public void registerObserver(Mentor mentor) {
        observers.add(mentor);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Mentor mentor) {
        observers.remove(mentor);

    }

    public Deque<String> getTask() {
        return task;
    }

    public String getName() {
        return name;
    }
}
