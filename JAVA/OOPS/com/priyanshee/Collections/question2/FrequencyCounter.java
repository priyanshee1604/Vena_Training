package com.priyanshee.Collections.question2;

import java.util.Map;
import java.util.TreeMap;
//TODO: Enhance by doing the same by stream API.
public class FrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "This is a test. This test is only a test.";

        //1. removing the special characters and converting the sentence to all lower case.
        String[] arrayOfWords =  paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");

        //used TreeMap here as to keep the words sorted in alphabetical order
        Map<String, Integer> words = new TreeMap<>();

        for (String arrayOfWord : arrayOfWords) {
            if (words.containsKey(arrayOfWord)) {
                words.put(arrayOfWord, words.get(arrayOfWord) + 1);
            } else {
                words.put(arrayOfWord, 1);
            }
        }

        System.out.println("Number of unique words: " + words.size());
        System.out.println("Frequency of each word: " + words.entrySet());
        System.out.println("Words sorted alphabetically: " + words.keySet());
     }
}
