package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static final String name = "Circle";

    private final long r;

    public Circle(long radius) {
        this.r = radius;
    }

    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField() {
        return r * r * Math.PI;
    }
}

