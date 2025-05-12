package com.priyanshee.ExceptionHandling.question7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try (ResourceOne r1 = new ResourceOne();
             ResourceTwo r2 = new ResourceTwo();
        ) {
            throw new Exception("Exception in main block.");
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());

            for (Throwable suppressed: e.getSuppressed()) {
                System.err.println("Suppressed: " + suppressed);
            }
        }
    }
}
