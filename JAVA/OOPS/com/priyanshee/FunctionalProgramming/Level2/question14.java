package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.List;

//14.	Convert a list of integers into a list of their squares.
public class question14 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));

        numbers.stream().map(i -> i*i).forEach(System.out::println);
    }
}
