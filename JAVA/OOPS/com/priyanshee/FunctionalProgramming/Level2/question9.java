package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

//9.	Convert a list of strings to uppercase using map().
public class question9 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan"));
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
