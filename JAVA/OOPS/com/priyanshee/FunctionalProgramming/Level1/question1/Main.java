package com.priyanshee.FunctionalProgramming.Level1.question1;

import java.util.function.Predicate;
//1.	Write a Predicate<String> that returns true if a string starts with “A”.
public class Main {
    public static void main(String[] args) {
        Predicate<String> startsWithA = s -> s.startsWith("A");
        System.out.println(startsWithA.test("Apple"));
        System.out.println(startsWithA.test("Anna"));
        System.out.println(startsWithA.test("Cat"));
        System.out.println(startsWithA.test("Ball"));
        System.out.println(startsWithA.test("Dog"));
        System.out.println(startsWithA.test("Elle"));
        System.out.println(startsWithA.test("Aeiou"));
    }
}
