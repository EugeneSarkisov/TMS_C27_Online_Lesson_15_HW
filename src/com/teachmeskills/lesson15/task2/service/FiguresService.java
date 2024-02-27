package com.teachmeskills.lesson15.task2.service;

/**
 * This class contain method to count the perimeter of figures in the list.
 */

import com.teachmeskills.lesson15.task2.figure.Figure;
import java.util.List;

public class FiguresService {
    public static void countPerimeter(List<Figure> figures){
        for(Figure figure: figures){
            System.out.println(figure.getShape() + " " + figure.calculatePerimeter());
        }
    }
}
