package com.teachmeskills.lesson15.task3.service;

/**
 * This class contain method to create the collection of random
 * numbers and count the average.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectionService {
    public static void countAverageOfCollection(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Input size of collection: ");
            ArrayList<Integer> intCollection = new ArrayList<>();
            int sizeOfCollection = scanner.nextInt();
            if(sizeOfCollection <= 0){
                System.out.println("Size of collection can't be negative!");
            } else {
                for(int i = 0; i < sizeOfCollection; i++){
                    intCollection.add((int)(Math.random() * 10));
                }
                System.out.println(intCollection);
                double average = 0.0;
                for(int numbers : intCollection){
                    average += numbers;
                }
                System.out.println("Average of collection: " + (average / (sizeOfCollection)));
            }
        } catch(InputMismatchException e){
            System.out.println("Input error! Please type the numbers.");
        }
    }
}
