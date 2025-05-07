package com.priyanshee.FunctionalProgramming.Level1.question4;

import java.util.function.Supplier;

//4.Write a Supplier<Double> that generates a random number.
public class Main {
    public static void main(String[] args) {
        Supplier<Double> randomNum = Math::random;

        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
    }
}
