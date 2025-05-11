package com.priyanshee.FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class question9 {
    public static void main(String[] args) {
        Path fileName = Paths.get("filetodelete.txt");
        try {
            if(Files.deleteIfExists(fileName)) {
                System.out.println("File deleted successfully.🥳");
            } else {
                System.out.println("File do not exsits.");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
