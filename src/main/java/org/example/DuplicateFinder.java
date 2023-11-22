package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFinder implements IFindDuplicates {
    /***
     * Non-case-sensitive, String duplicates searching and counter method for Map data
     * @param inputList - source raw dataset of mixed String values
     * @return - Map with key - duplicated String,and value - quantity of duplicated strings
     */
    @Override
    public Map<String, Integer> findDuplicatesInList(List<String> inputList) {
        Map<String, Integer> duplicated = new HashMap<>();

        if(inputList==null){
            return duplicated;
        }

        for (String checkableItem: inputList) {
            if(duplicated.containsKey(checkableItem)){
                duplicated.put(checkableItem, duplicated.get(checkableItem) + 1);
            }else{
                duplicated.put(checkableItem, 1);
            }
        }
        return duplicated;
    }
}
