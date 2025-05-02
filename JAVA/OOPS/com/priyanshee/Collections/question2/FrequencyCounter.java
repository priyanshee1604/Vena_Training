package com.priyanshee.Collections.question2;

import java.util.Map;
import java.util.TreeMap;
//TODO: Enhance by doing the same by stream API.
public class FrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "This is a test. This test is only a test.";

        //1. removing the special characters and converting the sentence to all lower case.
        String[] arrayOfWords =  paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ").split("\\s+");

        Map<String, Integer> words = new TreeMap<>();

        for(int i = 0; i < arrayOfWords.length; i++) {
            if(words.containsKey(arrayOfWords[i])) {
                words.put(arrayOfWords[i], words.get(arrayOfWords[i]) + 1);
            } else {
                words.put(arrayOfWords[i], 1);
            }
        }

        System.out.println("Printing the unique words in alphabetical order: " + words.keySet());
        System.out.println("Printing the frequency of each word: " + words.entrySet());
     }
}
