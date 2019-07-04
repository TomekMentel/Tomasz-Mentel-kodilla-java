package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVNING = "DRIVNING";
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVNING:
                return new DrivingTask("Drivning", "School", "Buss");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Water", 2);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "Wall");
            default:
                return null;
        }
    }
}

