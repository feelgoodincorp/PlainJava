package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(0, 23, 8, 11, 24, 25, 26, 26, 0, 17, 34, 55);
        SubsequenceFinder handler = new SubsequenceFinder();

        List<Integer> result = handler.findHighest(numList);
        System.out.println(result);
    }
}