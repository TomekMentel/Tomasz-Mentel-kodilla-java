package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> theFigure = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        theFigure.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (theFigure.contains(shape)) {
            theFigure.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {

        return theFigure.get(n);

    }

    public void showsFigure() {

        for (Shape figure : theFigure) {
            System.out.println(figure);
        }
    }

    public int getShapesQuantity() {
        return theFigure.size();
    }
}