package org.Task3;

import java.util.List;
import java.util.Map;

public class WordFrequencyMain {
    public static void main(String[] args) {
        String filename = "words.txt";
        List<String> wordsList = WordFileReader.readWordsFromFile(filename);
        Map<String, Integer> wordFrequencyMap = WordFrequencyCalculator.countWordFrequency(wordsList);
        WordFrequencyPrinter.printWordFrequency(wordFrequencyMap);
    }
}
