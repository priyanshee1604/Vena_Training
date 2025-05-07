package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

public class question8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}
