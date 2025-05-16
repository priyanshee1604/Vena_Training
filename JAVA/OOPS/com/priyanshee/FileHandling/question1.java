package com.priyanshee.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class question1 {
  public static void main(String[] args) {
    String fileName = "notes.txt";
    String context = "This is my first file in JAVA.";

    try {
      //creates a new file and writes to it.
      FileWriter writer = new FileWriter(fileName);
      writer.write(context);
      writer.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }
  }
}
