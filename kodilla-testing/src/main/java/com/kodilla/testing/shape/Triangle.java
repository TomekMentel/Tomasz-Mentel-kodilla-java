package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private static final String name = "Triangle";

    private final double a;
    private final double h;

    public Triangle(double base_length, double height) {
        this.a = base_length;
        this.h = height;
    }

    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField() {
        return a * h / 2;
    }
}