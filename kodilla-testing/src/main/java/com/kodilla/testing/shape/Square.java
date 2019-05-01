package com.kodilla.testing.shape;

public class Square implements Shape {

    private static final String name = "Square";

    private final double a;

    public Square(double side_length) {
        this.a = side_length;
    }

    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField() {
        return a * a;
    }
}
