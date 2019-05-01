package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name = "Circle";
    @Override
    public String getShapeName() {

        return name;
    }

    @Override
    public double getField(double r ,double fi) {
        double field = (r * r) * fi;
        return field;
    }
}
