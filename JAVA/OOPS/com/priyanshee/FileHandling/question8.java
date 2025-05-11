package com.priyanshee.FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class question8 {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            lines.stream().forEach(line-> System.out.println(line.toUpperCase()));
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
