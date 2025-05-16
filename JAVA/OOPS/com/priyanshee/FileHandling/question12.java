package com.priyanshee.FileHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class question12 {
    public static void main(String[] args) {

        Path folderPath = Paths.get("/Users/psisodiya/Desktop/Vena_Training"); // Folder containing .txt files
        Path mergedFile = Paths.get("merged.txt");

        try {
            // Create or clear the merged.txt file with nothing in it specified by new bytes[0].
            Files.write(mergedFile, new byte[0], StandardOpenOption.CREATE);

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(folderPath, "*.txt")) {
                for (Path file : stream) {
                    // Read content from each .txt file
                    Stream<String> lines = Files.lines(file, StandardCharsets.UTF_8);
                    // Append to merged.txt
                    Files.write(mergedFile, (lines.collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()).getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
                    lines.close();
                }
            }

            System.out.println("All .txt files merged into merged.txt.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
