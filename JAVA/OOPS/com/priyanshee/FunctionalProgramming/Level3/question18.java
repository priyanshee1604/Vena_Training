package com.priyanshee.FunctionalProgramming.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//18.	Join a list of strings into a single comma-separated string.
public class question18 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));
        System.out.println(fruits.stream().collect(Collectors.joining(", ")));
    }
}
