package com.teachmeskills.lesson15.task2.figure;

/**
 * This class extends abstract class "Figure" and contain pattern
 * for "Rectangle" objects and initialize methods.
 */

public class Rectangle extends Figure {
    double height;
    double width;

    public Rectangle(String shape, int sideCount, double height, double width) {
        super(shape, sideCount);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

}
