package com.priyanshee.FunctionalProgramming.Bonus;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class question52 {

    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).toList();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Ankit", "Charlie", "Arjun");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filtered = filterAndLog(names, startsWithA);
        System.out.println("Result: " + filtered);
    }
}

