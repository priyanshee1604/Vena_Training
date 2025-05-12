package com.priyanshee.ExceptionHandling.question10;

public class BadFlow {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            for (int number : numbers) {
                if (number == 3) {
                    throw new Exception("Found number 3, exiting loop");
                }
                System.out.println("Processing number: " + number);
            }
        } catch (Exception e) {
            System.out.println("Breaking loop because: " + e.getMessage());
        }
    }
}
