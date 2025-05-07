package com.priyanshee.FunctionalProgramming.Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//21.	Convert a list of integers to a Set using Collectors.toSet().
public class question21 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(123,43,43,1,2,5,2,436,35,25,36,35,8,34,636,2,55,3,6,2,1,15,6,7,5));

        System.out.println(numbers.stream().collect(Collectors.toSet()));
    }
}
