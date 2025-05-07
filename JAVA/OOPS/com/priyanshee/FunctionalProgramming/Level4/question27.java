package com.priyanshee.FunctionalProgramming.Level4;

import java.util.ArrayList;
import java.util.List;

//27.	Compute the average length of strings in a list.
public class question27 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Watermelon", "Muskmelon", "Apple", "Grapes", "Banana", "Mango", "Banan", "gas", "has", "yellow"));
        System.out.println(fruits.stream().mapToInt(String::length).average());
    }

}
