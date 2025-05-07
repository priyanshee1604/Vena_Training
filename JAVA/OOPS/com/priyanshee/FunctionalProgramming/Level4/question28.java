package com.priyanshee.FunctionalProgramming.Level4;

import java.util.ArrayList;
import java.util.List;

//28.	Find the product of all even numbers in a list using reduce().
public class question28 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(numbers.stream().filter(i -> i % 2 == 0).reduce(1, (a, b) -> a * b));
    }
}
