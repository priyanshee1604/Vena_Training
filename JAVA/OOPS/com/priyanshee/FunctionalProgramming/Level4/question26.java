package com.priyanshee.FunctionalProgramming.Level4;

import java.util.Arrays;
import java.util.List;

//26.	From a list of words, remove duplicates and return sorted result.
public class question26 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "banana", "grape");
        words.stream().distinct().sorted().forEach(System.out::println);
    }
}
