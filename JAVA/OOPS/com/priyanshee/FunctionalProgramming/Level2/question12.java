package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

//12.	Find the longest string in a list using reduce().
public class question12 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));
        System.out.println(fruits.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2));
    }
}
