package com.priyanshee.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Function;

public class question5 {
    public static void main(String[] args) {
        File sorucefile = new File("notes.txt");
        File backupFile = new File("backup.txt");

        try(FileReader fr = new FileReader(sorucefile)){
            FileWriter fw = new FileWriter(backupFile);

            int character;

            while ((character = fr.read()) != -1) {
                fw.write(character);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("An error occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
