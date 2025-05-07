package com.priyanshee.FunctionalProgramming.Level2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//13.	Sort a list of integers in descending order using streams.
public class question13 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(123,43,43,1,2,5,2,436,35,25,36,35,8,34,636,2,55,3,6,2,1,15,6,7,5));
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList());

    }
}
