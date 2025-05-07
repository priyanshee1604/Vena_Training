package com.priyanshee.FunctionalProgramming.Level5.question29;

//29.	Create your own functional interface called TriFunction<T, U, V, R> (takes 3 args).
public class Main {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> sumThree = (a, b, c) -> a + b + c;
        int result = sumThree.method(10, 20, 30);
        System.out.println(result); // Output: 60
    }
}
