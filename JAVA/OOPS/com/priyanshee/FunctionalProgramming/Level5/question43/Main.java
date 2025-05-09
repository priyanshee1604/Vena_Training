package com.priyanshee.FunctionalProgramming.Level5.question43;


import java.util.List;
import java.util.function.Function;


public class Main {
    public static <T, R> List<R> applyFunction(List<T> list, Function<T, R> function) {
        return  list.stream().map(function).toList();
    }

    public static void main(String[] args) {
        Function<Integer, Integer> functionDob = a -> a * 2;
        applyFunction(List.of(1,2,3,4,5,6,6), functionDob).forEach(System.out::println);

    }

}
