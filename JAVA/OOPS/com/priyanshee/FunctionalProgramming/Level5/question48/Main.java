package com.priyanshee.FunctionalProgramming.Level5.question48;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static <T> Optional<T> getThirdElement(List<T> list) {
        return list.stream().skip(2).findFirst();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        Optional<String> third = getThirdElement(names);
        third.ifPresentOrElse(name -> System.out.println("Third element: " + name), () -> System.out.println("List has fewer than 3 elements"));

        List<Integer> number = List.of();
        Optional<Integer> three = getThirdElement(number);
        three.ifPresentOrElse(numb -> System.out.println("Third element: " + numb), () -> System.out.println("List has fewer than 3 elements"));

    }
}

