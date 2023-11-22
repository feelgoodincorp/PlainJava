package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> mixedStringList = Arrays.asList("Hi", "Hello", "Bye", "bye", "Meow", "hi", "Meow", "Bye", "Bye");
        DuplicateFinder finder = new DuplicateFinder();

        Map<String, Integer> result = finder.findDuplicatesInList(mixedStringList);
        System.out.println(result);
    }
}
