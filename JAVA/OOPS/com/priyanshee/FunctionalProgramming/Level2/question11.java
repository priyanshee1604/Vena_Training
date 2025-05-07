package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

//11.	Count how many strings in a list start with “S”.
public class question11 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("seal", "seal", "elle", "sundown", "sand", "slipper", "banana", "gas", "has", "yellow"));

        System.out.println(fruits.stream().filter(s -> s.startsWith("s")).count());
    }
}
