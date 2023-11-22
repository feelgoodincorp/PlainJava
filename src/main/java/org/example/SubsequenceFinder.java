package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SubsequenceFinder {
    /***
     * Non-duplicate-sensitive, Integers List highest sequence finding method
     * @param list - source raw dataset of mixed Integer values
     * @return - List with value - largest sequence of values
     */
    public List<Integer> findHighest(List<Integer> list){
        List<Integer> highestSubsequence = new ArrayList<>();
        if(list == null){
            return highestSubsequence;
        }

        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) <= list.get(i + 1)){
                tempList.add(list.get(i));
            }else if(highestSubsequence.size() <= tempList.size()){
                highestSubsequence = List.copyOf(tempList);
                tempList.clear();
            }
        }
        return highestSubsequence;
    }
}
