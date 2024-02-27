package com.teachmeskills.lesson15.task2.run;

import com.teachmeskills.lesson15.task2.fabric.FigureFabric;
import com.teachmeskills.lesson15.task2.service.FiguresService;

public class Runner {
    public static void main(String[] args) {
        FiguresService.countPerimeter(FigureFabric.createFigures());
    }
}
