package com.priyanshee.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class question15 {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "charcount.txt";

        Map<Character, Integer> charCountMap = new HashMap<>();

        try (FileReader reader = new FileReader(inputFile)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;
                charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
            }

            try (FileWriter writer = new FileWriter(outputFile)) {
                for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                    writer.write(entry.getKey() + " " + entry.getValue() + "\n");
                }
            }

            System.out.println("Character count written to charcount.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
