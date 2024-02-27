package com.teachmeskills.lesson15.task4.service;

/**
 * This class contain method to print all names of students (and teacher name too)
 * on the screen.
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentsService {
    public static void getGroupNames(){
        Set<String> nameCollection = new LinkedHashSet<>();
        nameCollection.add("Artyom Astapchik");
        nameCollection.add("Eugene Sarkisov");
        nameCollection.add("Anastasiya Irgalieva");
        nameCollection.add("Ruslan Ryabuhin");
        nameCollection.add("Ruslan Tretyak");
        nameCollection.add("Artyom Karalchuk");
        nameCollection.add("Oleg Maneev");
        nameCollection.add("Ivan Mihnavetski");
        nameCollection.add("Alexei Shubin");
        nameCollection.add("Nikita Kraiko");
        nameCollection.add("Alina Ilkevich");
        nameCollection.add("Alexandr Khamitski");
        nameCollection.add("Vladislav Kolos");
        nameCollection.add("Kirill Palyanica");
        nameCollection.add("Pavel Svinko");
        nameCollection.add("Daniil Chabotko");
        nameCollection.add("TMS - Andrey Reut");
        System.out.println(nameCollection);
    }
}
