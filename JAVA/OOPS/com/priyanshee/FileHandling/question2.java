package com.priyanshee.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class question2 {
  public static void main(String[] args) {
    String fileName = "notes.txt";

    try {
      //this line tells java that hey i want to work with this file.
      File file = new File(fileName);

      //This creates a Scanner object that is connected to the file.
      //This opens the file for reading.
      Scanner scanner = new Scanner(file);

      System.out.println("Contents of " + fileName + ":");
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }

      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("The file " + fileName + " was not found.");
      e.printStackTrace();
    }
  }
}
