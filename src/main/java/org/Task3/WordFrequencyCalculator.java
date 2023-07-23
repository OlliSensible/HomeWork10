package org.Task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCalculator {
    public static Map<String, Integer> countWordFrequency(List<String> wordsList) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : wordsList) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        return wordFrequencyMap;
    }
}
