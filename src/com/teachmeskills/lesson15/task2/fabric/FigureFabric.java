package com.teachmeskills.lesson15.task2.fabric;

/**
 * This class contain method to create the list of figures.
 */

import com.teachmeskills.lesson15.task2.figure.Circle;
import com.teachmeskills.lesson15.task2.figure.Figure;
import com.teachmeskills.lesson15.task2.figure.Rectangle;
import com.teachmeskills.lesson15.task2.figure.Triangle;

import java.util.ArrayList;
import java.util.List;

public class FigureFabric {
    public static List<Figure> createFigures(){
        Figure rectangle = new Rectangle("Rectangle", 4, 3.0, 4.0) ;
        Figure circle = new Circle("Circle", 1, 7.0);
        Figure triangle = new Triangle("Triangle", 3, 5.0, 5.0, 6.0);
        Figure rectangle2 = new Rectangle("Rectangle", 4, 6.0, 7.0) ;
        Figure triangle2 = new Triangle("Triangle", 3, 8.0, 8.0, 7.0);
        List<Figure> figures = new ArrayList<>();
        figures.add(rectangle);
        figures.add(circle);
        figures.add(triangle);
        figures.add(rectangle2);
        figures.add(triangle2);
        return figures;
    }
}
