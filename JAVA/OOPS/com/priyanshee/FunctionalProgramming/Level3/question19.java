package com.priyanshee.FunctionalProgramming.Level3;

import java.util.ArrayList;
import java.util.List;

//19.	Find the first element in a list of integers that is divisible by 5 using findFirst().
public class question19 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(123,43,43,1,2,5,2,436,35,25,36,35,8,34,636,2,55,3,6,2,1,15,6,7,5));

        System.out.println(numbers.stream().filter(i -> i % 5 == 0).findFirst().get());
    }
}
