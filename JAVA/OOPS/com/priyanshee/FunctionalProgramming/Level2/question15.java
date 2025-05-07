package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

//15.	From a list of words, create a list of their lengths.
public class question15 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));

        fruits.stream().map(String::length).forEach(System.out::println);
    }
}
