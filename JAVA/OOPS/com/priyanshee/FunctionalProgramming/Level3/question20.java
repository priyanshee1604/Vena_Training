package com.priyanshee.FunctionalProgramming.Level3;

import java.util.Optional;

//20.	Use Optional to safely get a value or return a default.
public class question20 {
    public static void main(String[] args) {
        String name = "Priyanshee";
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalName2 = Optional.ofNullable(null);
        System.out.println(optionalName.orElseGet(() -> "name"));
        System.out.println(optionalName2.orElseGet(()->"name"));
    }
}
