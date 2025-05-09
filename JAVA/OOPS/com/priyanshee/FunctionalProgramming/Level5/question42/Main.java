package com.priyanshee.FunctionalProgramming.Level5.question42;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(List.of("1", "2", "3", "4"));

        Function<String, Integer> parseInterger = Integer::parseInt;
        Function<Integer, Integer> doubleint = x -> x * 2;
        Function<String, Integer> combinedOp = parseInterger.andThen(doubleint);

        numbers.stream().map(combinedOp).forEach(System.out::println);
    }
}
