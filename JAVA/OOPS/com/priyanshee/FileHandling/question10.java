package com.priyanshee.FileHandling;

import java.io.IOException;
import java.nio.file.*;

public class question10 {
    public static void main(String[] args) {
        Path dir = Paths.get("/Users/psisodiya/Desktop/Vena_Training/JAVA/OOPS/com/priyanshee/FunctionalProgramming/Bonus");

        if (Files.exists(dir) && Files.isDirectory(dir)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
                System.out.println("Contents of 'documents' folder:");
                for (Path entry : stream) {
                    if (Files.isDirectory(entry)) {
                        System.out.println("[DIR]  " + entry.getFileName());
                    } else {
                        System.out.println("[FILE] " + entry.getFileName());
                    }
                }
            } catch (IOException | DirectoryIteratorException e) {
                System.err.println("Error reading directory: " + e.getMessage());
            }
        } else {
            System.out.println("Folder does not exist or is not a directory.");
        }
    }
}
