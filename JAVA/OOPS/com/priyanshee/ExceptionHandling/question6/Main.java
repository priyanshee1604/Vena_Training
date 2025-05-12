package com.priyanshee.ExceptionHandling.question6;

public class Main {
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();

        try {
            processor.validateFile("employees.csv");
        } catch (FileValidationException e) {
            System.err.println("Validation Error: " + e.getMessage());
        }

        processor.checkSystemHealth();
        System.out.println("unreachable code.");
    }
}
