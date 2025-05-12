package com.priyanshee.ExceptionHandling.question4;

public class Main {
    public static void main(String[] args) {
        FileOp file = new FileOp();
        try {
            file.readFile("nonexsitingfile.txt");
        } catch (CustomException e) {
            System.err.println("Caught Custom Exception in Main method: " + e.getMessage());
            System.out.println(e.getCause());
        }
    }
}
