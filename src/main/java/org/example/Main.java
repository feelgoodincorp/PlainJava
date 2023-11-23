package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //prints max size of regular subsequence of numbers list
        List<Integer> numList = Arrays.asList(0, 23, 8, 11, 24, 25, 26, 26, 0, 17, 34, 55);
        SubsequenceFinder subsequenceFinder = new SubsequenceFinder();

        List<Integer> subsequenceResult = subsequenceFinder.findHighest(numList);
        System.out.println("Max quantity: " + subsequenceResult.size());

        //prints quantity and value of duplicated strings
        List<String> mixedStringList = Arrays.asList("Hi", "Hello", "Bye", "bye", "Meow", "hi", "Meow", "Bye", "Bye");
        DuplicateFinder duplicateFinder = new DuplicateFinder();

        Map<String, Integer> duplicatesResult = duplicateFinder.findDuplicatesInList(mixedStringList);
        System.out.println("Duplicates: " + duplicatesResult);
    }
}