package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name = "Triangle";
    double a;
    double h;

    @Override
    public String getShapeName() {
        return name;
    }

    public double getField(double a,double h ) {

        double field = 0.5 * (a * h);
        return field;
    }
}
