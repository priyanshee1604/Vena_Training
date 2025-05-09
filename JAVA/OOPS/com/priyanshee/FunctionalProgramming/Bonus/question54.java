package com.priyanshee.FunctionalProgramming.Bonus;

import java.util.*;
import java.util.stream.Collectors;

public class question54 {
    public static void main(String[] args) {
        List<String> strings = List.of("banana", "apple", "strawberry", "kiwi", "watermelon", "grape", "pineapple");
        strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).limit(3).forEach(System.out::println);
    }
}
