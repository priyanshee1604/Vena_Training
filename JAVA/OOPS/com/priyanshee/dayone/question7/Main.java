package com.priyanshee.dayone.question7;

public class Main {
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
        System.out.println("Sum: " + calc.add(1,2));

        //give meaningful names: ✅
        //🗒️NOTES:
        //this does not work because during compilation it checks for the reference type.
        //i.e. the basicCalculator should have subtract method at compile time because
        // we created a reference of it.
        //but it does not have that method, during compilation thus throws an error.

        //while at runtime, object is checked against the runtime compilation.
        //thus overriding it possible due to obj type check during runtime.
        //BasicCalculator smCalc = new SmartCalculator();
        //System.out.println("Subtraction: " + smCalc.subtract(20,10));
        //System.out.println("Addition: " + smCalc.add(20,10));

        SmartCalculator smCalc = new SmartCalculator();
        System.out.println("Subtraction: " + smCalc.subtract(20,10));
        System.out.println("Addition: " + smCalc.add(20,10));
    }
}
