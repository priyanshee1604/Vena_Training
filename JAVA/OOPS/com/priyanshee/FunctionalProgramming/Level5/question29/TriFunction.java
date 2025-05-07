package com.priyanshee.FunctionalProgramming.Level5.question29;

@FunctionalInterface
public interface TriFunction<A, B, C, R> {
    R method(A a, B b, C c);
}