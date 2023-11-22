package org.example;

import java.util.List;
import java.util.Map;

interface IFindDuplicates {
    //    findDuplicatesInList should output Map that contains <StringValue>: number of duplicates
    //    ex. given list: ["Hi", "Hello", "Bye", "bye", "Meow", "hi", "Meow", "Bye", "Bye"]
    //    output: {"Meow": 2, "Bye": 3}
    Map<String, Integer> findDuplicatesInList(List<String> inputList);
}

