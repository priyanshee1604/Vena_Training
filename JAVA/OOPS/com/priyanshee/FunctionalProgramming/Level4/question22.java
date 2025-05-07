package com.priyanshee.FunctionalProgramming.Level4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//22.	Write a function that takes a list of strings and returns a map of word to its length.
public class question22 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));
        System.out.println(fruits.stream().collect(Collectors.toMap(s -> s, String::length)));
    }
}
