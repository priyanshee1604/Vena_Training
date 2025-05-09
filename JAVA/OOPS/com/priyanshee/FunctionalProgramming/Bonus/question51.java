package com.priyanshee.FunctionalProgramming.Bonus;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class question51 {
    public static void main(String[] args) {
        String paragraph = "This is a test. This test is only a test!";

        Map<String, Long> wordFrequency = Arrays.stream(paragraph.toLowerCase().split("\\W+")).filter(word -> !word.isBlank()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordFrequency.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

