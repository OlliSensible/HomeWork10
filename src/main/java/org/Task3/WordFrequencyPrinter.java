package org.Task3;

import java.util.*;

public class WordFrequencyPrinter {
    public static void printWordFrequency(Map<String, Integer> wordFrequencyMap) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordFrequencyMap.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
