package com.kodilla.testing.shape;

public class Square implements Shape {

    private static final String name = "Square";

    private final double a;

    public Square(double sideLength) {
        this.a = sideLength;
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
