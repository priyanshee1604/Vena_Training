package com.priyanshee.FunctionalProgramming.Level1.question5;

import java.util.*;
import java.util.function.Consumer;

//5.Use a lambda expression to sort a list of strings alphabetically.
public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan"));
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
