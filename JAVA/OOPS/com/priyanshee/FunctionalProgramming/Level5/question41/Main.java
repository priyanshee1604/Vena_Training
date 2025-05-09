package com.priyanshee.FunctionalProgramming.Level5.question41;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>(List.of(
            "  Hello, World!!  ",
            "Java is Great.",
            "Let's Stream This!"
        ));

        Function<String, String> toTrim = String::trim;
        Function<String, String> toLowerCase = String::toLowerCase;
        Function<String, String> removePunch = s -> s.replaceAll("\\p{Punct}", "");
        Function<String, String> pipeline = toTrim.andThen(toLowerCase).andThen(removePunch);

        sentences.stream().map(pipeline).forEach(System.out::println);
    }
}
