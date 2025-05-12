package com.priyanshee.ExceptionHandling.question10;

public class GoodFlow {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            if (number == 3) {
                System.out.println("Found number 3, exiting loop");
                break;
            }
            System.out.println("Processing number: " + number);
        }
    }
}
