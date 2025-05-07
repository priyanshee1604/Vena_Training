package com.priyanshee.FunctionalProgramming.Level1.question3;

import java.util.function.Consumer;

//3.Use a Consumer<String> to print a string in uppercase.
public class Main {
    public static void main(String[] args) {
        Consumer<String> toUpperCase = s -> System.out.println(s.toUpperCase());

        toUpperCase.accept("priyanshee");
        toUpperCase.accept("Lakshya");
        toUpperCase.accept("sumitra");
        toUpperCase.accept("NARENDRA SINGH");

    }
}
