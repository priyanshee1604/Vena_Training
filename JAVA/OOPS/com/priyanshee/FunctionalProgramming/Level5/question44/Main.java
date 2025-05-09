package com.priyanshee.FunctionalProgramming.Level5.question44;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> doublee = x -> x * 2;

        System.out.println(square.andThen(doublee).apply(3));
        System.out.println(square.compose(doublee).apply(3));

    }
}
