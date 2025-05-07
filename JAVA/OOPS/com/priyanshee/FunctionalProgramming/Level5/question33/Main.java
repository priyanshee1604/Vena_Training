package com.priyanshee.FunctionalProgramming.Level5.question33;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(6, 7, 8, 2)
        );

       listOfLists.stream().flatMap(List::stream).filter(n-> n%2==0).distinct().forEach(System.out::println);
    }
}
