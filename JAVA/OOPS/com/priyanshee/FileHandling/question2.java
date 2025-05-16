package com.priyanshee.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
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

//using fileReader: read one character at a time.
//read returns the ASCII value of the read character thus need to type cast it.
//try  (FileReader fr = new FileReader("notes.txt")){
//    int charachter;
//    while ((charachter = fr.read()) != -1) {
//        System.out.println((char) charachter);
//     }
//   } catch (IOException e) {
//     System.out.println("The file " + fileName + " was not found.");
//      e.printStackTrace();
//   }