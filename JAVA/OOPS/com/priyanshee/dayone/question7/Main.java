package com.priyanshee.dayone.question7;

public class Main {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        System.out.println("Sum: " + calc.add(1,2));

        SmartCalculator calcsm = new SmartCalculator();
        System.out.println("Subtraction: " + calcsm.subtract(20,10));
    }
}
