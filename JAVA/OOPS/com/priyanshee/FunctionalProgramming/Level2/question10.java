package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

//10.	Given a list of names, return a list of names longer than 4 characters.
public class question10 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));

        fruits.stream().filter(s -> s.length() > 4).forEach(System.out::println);
    }
}
