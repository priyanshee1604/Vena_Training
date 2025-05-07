package com.priyanshee.FunctionalProgramming.Level4;

//list of names, perform the following using streams:
//Filter names that start with the letter 'A'.
//Map them to uppercase.
//Sort them alphabetically.
//Collect the result into a list.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class question24 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));

        fruits.stream().filter(s->s.startsWith("B")).map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }
}
