package com.priyanshee.FileHandling.handson;

import java.io.*;

public class LogFileAnalyzer {
    public static void main(String[] args) {
        // Default file names
        String inputFile = "server.log";
        String outputFile = "summary.txt";

        // Taking filenames from command-line arguments if provided
        if (args.length >= 2) {
            inputFile = args[0];
            outputFile = args[1];
        }

        int totalEntries = 0;
        int errorCount = 0;
        int warningCount = 0;

        // Read the log file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalEntries++;
                if (line.contains("ERROR")) {
                    errorCount++;
                }
                if (line.contains("WARNING")) {
                    warningCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return; // Stop execution if reading fails
        }

        // Calculate percentages
        //if totalEntries are 0 then avoid dividing by 0 and directly put the % as 0.
        double errorPercentage = totalEntries == 0 ? 0 : (errorCount * 100.0 / totalEntries);
        double warningPercentage = totalEntries == 0 ? 0 : (warningCount * 100.0 / totalEntries);

        // Write a summary report to an output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Log Summary Report\n");
            bw.write("------------------\n");
            bw.write("Total log entries: " + totalEntries + "\n");
            bw.write("ERROR entries: " + errorCount + " (" + errorPercentage + "%)\n");
            bw.write("WARNING entries: " + warningCount + " (" + warningPercentage + "%)\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Summary written to " + outputFile);
    }
}

