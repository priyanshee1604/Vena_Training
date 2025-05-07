package com.priyanshee.FunctionalProgramming.Level1.question2;

import java.util.function.Function;

//2.	Create a Function<String, Integer> that returns the length of a string.
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> length = String::length;

        System.out.println(length.apply("asdfsdfasfasf"));
        System.out.println(length.apply("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(length.apply("Priyanshee"));
        System.out.println(length.apply("Sisodiya"));
        System.out.println(length.apply("Lakshya"));
        System.out.println(length.apply("Raj"));
        System.out.println(length.apply("Singh"));
    }
}
