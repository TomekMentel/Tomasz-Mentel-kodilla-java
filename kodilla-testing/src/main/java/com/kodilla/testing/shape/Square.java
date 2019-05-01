package com.kodilla.testing.shape;

public class Square implements Shape {

    String name = "Square";
  double a;
  double b;
    @Override
    public String getShapeName() {
        return name;
    }

    public double getField(double a, double b) {

        double field = a * b;
        return field;
    }
}