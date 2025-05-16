package com.priyanshee.FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class question6 {
    public static void main(String[] args) {
        Path filePath = Paths.get("paragraph.txt");
//        int javaCount = 0;

        try {
            List<String> lines = Files.readAllLines(filePath);

            System.out.println("Count of word java is " + lines.stream().flatMap(line -> Arrays.stream(line.split("\\W+")).filter(word -> word.equalsIgnoreCase("java"))).count());


//            for (String line: lines) {
//                String[] words = line.split("\\W+");
//
//                for (String word: words) {
//                    if (word.equalsIgnoreCase("java"))
//                        javaCount++;
//                }
//            }
//
//            System.out.println("Count of word java: " + javaCount);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occured.");
        }
    }
}
