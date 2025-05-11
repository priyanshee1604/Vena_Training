package com.priyanshee.FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class question7 {
    public static void main(String[] args) {
        Path path = Paths.get("log.txt");
        String currentDate = LocalDate.now().toString();
        String lineToAppend = "\nLast updated on " + currentDate;

        try {
            Files.write(path, lineToAppend.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Lines appended successfully.");
        } catch (IOException e) {
            System.out.println("Error occured.");
            e.printStackTrace();
        }
    }
}
