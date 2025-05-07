package com.priyanshee.FunctionalProgramming.Level1.question6;

//6.	Create a BiFunction<Integer, Integer, Integer> that returns the sum.
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> summation = (a, b) -> a+b;
        System.out.println(summation.apply(1,2));
        System.out.println(summation.apply(3,23));
        System.out.println(summation.apply(4,286));
        System.out.println(summation.apply(5,25));
        System.out.println(summation.apply(6,12));
        System.out.println(summation.apply(7,223));
        System.out.println(summation.apply(8,22));

    }
}
