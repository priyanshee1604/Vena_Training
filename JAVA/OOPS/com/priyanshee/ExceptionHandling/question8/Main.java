package com.priyanshee.ExceptionHandling.question8;

public class Main {
    public static void main(String[] args) {
        FlakyService service = new FlakyService();
        RetryMechanism execute = new RetryMechanism();

        try {
            String result = execute.fetchDateWithRetry(service, 3);
            System.out.println("Successfully fetched: " + result);
        } catch (ServiceUnavailableException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
