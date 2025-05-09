package com.priyanshee.FileHandling;

import java.io.File;

public class question3 {
    public static void main(String[] args) {
        // Create a File object representing the report.pdf file
        File file = new File("notes.txt");

        // Check if the file exists
        if (file.exists()) {
            // Get the size of the file in bytes
            long fileSize = file.length();
            System.out.println("File 'notes.txt' exists.");
            System.out.println("File size: " + fileSize + " bytes.");
        } else {
            System.out.println("File 'report.pdf' does not exist in the current directory.");
        }
    }
}
