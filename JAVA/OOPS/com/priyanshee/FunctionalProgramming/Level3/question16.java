package com.priyanshee.FunctionalProgramming.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//16.	Group a list of names by their first letter using Collectors.groupingBy().
public class question16 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));

        System.out.println(fruits.stream().collect(Collectors.groupingBy(s -> s.charAt(0))));
    }
}
