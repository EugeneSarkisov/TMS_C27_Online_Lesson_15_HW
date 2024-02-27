package com.teachmeskills.lesson15.task1.service;

/**
 * This class contain method which use to create collection from console.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsNumbers {
    public static void createCollection(){
        System.out.println("You can input any number to add him into collection. To exit from program - type 'Exit'.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intCollection = new ArrayList<>(10);
        boolean switcher = true;
        while (switcher) {
            String strVar = scanner.nextLine();
            int intVar;
            try {
                intVar = Integer.parseInt(strVar);
                intCollection.add(intVar);
            } catch (NumberFormatException e) {
                if (strVar.equals("Exit")) {
                    switcher = false;
                } else {
                    System.out.println("Invalid string input! Please, try again.");
                }
            }
            System.out.println(intCollection);
        }
        scanner.close();
    }
}
