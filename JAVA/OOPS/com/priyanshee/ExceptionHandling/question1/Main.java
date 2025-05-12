package com.priyanshee.ExceptionHandling.question1;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        try {
            processor.processDate();
        } catch (DataProcessingException e) {
            System.err.println("Exception caught in main: " + e.getMessage());
            System.out.println("Printing the stack Trace");
            e.printStackTrace();
        }
    }
}
