package com.teachmeskills.lesson15.task2.figure;

/**
 * This class extends abstract class "Figure", contain pattern
 * for "Circle" objects and initialize methods.
 */

public class Circle extends Figure {
    double radius;
    final double pi = 3.14;

    public Circle(String shape, int sideCount, double radius) {
        super(shape, sideCount);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }
}


