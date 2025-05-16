package com.priyanshee.FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class question14 {
    public static void main(String[] args) {
        Path inputPath = Paths.get("paragraph.txt");
        Path outputPath = Paths.get("output1.txt");

        try {
            // Read all lines from input.txt
            List<String> lines = Files.readAllLines(inputPath);

            // Write those lines to output.txt
            Files.write(outputPath, lines);

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while handling files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
