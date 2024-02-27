package com.teachmeskills.lesson15.task2.figure;

/**
 * This class extends abstract class "Figure" and contain pattern
 * for "Triangle" objects and initialize methods.
 */

public class Triangle extends Figure {
    double sideLeft;
    double sideRight;
    double sideBottom;

    public Triangle(String shape, int sideCount, double sideLeft, double sideRight, double sideBottom) {
        super(shape, sideCount);
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.sideBottom = sideBottom;
    }

    @Override
    public double calculatePerimeter() {
        return sideLeft + sideRight + sideBottom;
    }

}
