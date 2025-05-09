package com.priyanshee.FunctionalProgramming.Level5.quesstion40;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String csv = "1,2,3,4,5,6";
        Arrays.stream(csv.split(",")).map(String::trim).map(Integer::parseInt).toList().forEach(System.out::println);
    }
}
