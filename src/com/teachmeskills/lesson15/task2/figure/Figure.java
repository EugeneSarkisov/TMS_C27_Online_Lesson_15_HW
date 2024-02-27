package com.teachmeskills.lesson15.task2.figure;

/**
 * This abstract class contains pattern for all "Figure" objects
 * and declare their methods.
 */

public abstract class Figure {
    private String shape;
    final int sideCount;

    public Figure(String shape, int sideCount) {
        this.shape = shape;
        this.sideCount = sideCount;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public abstract double calculatePerimeter();
}

