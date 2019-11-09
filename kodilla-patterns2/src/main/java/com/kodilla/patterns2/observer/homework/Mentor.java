package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    public final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + ": New task : " + student.getName() + "\n" +
                " (total are : " + student.getTask().size() + " tasks");
        updateCount++;
    }

    public String getUsername() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
