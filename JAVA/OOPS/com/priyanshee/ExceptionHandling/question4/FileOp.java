package com.priyanshee.ExceptionHandling.question4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOp {
    public void readFile(String path) throws CustomException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println("Reading the file: " + reader.readLine());
        } catch (IOException e) {
            throw new CustomException("Failed to read the file.", e);
        }
    }
}
