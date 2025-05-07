package com.priyanshee.FunctionalProgramming.Level4;

import java.util.function.Function;
import java.util.stream.Stream;

//23.	Compose two functions: one that converts string to uppercase and one that appends “!”.
public class question23 {
    public static void main(String[] args) {
        String sentence = "Hello to the World of JAVA";

        Stream.of(sentence).map(String::toUpperCase).map(appendExclamation()).forEach(System.out::println);
    }

    public static Function<String, String> appendExclamation() {
        return str -> str + "!";
    }
}
