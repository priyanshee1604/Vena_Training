package com.priyanshee.ExceptionHandling.handson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradesProcessor {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the path to the grades file.");
        String filePath = inputScanner.nextLine();

        int totalGrades = 0;
        List<Student> validStudents = new ArrayList<>();
        List<Student> failingStudents = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");

                if (parts.length != 2) {
                    System.out.println("\nWarning: Skipping malformed line: " + line);
                    continue;
                }

                String name = parts[0];
                int grade = Integer.parseInt(parts[1]);

                if (grade < 0 || grade > 100) {
                    throw new InvalidGradeException("\nGrade out of range for student: " + name);
                }

                Student student = new Student(name, grade);
                validStudents.add(student);
                totalGrades = totalGrades + grade;

                if (grade < 40) {
                    failingStudents.add(student);
                }
            }

            if (!validStudents.isEmpty()) {
                System.out.println("\nValid Student Grades");
                validStudents.forEach(System.out::println);

                double avg = (double) totalGrades / validStudents.size();
                System.out.println("\nAverage grade: " + avg);
            }

            System.out.println("\nFailing Students");
            if (failingStudents.isEmpty()) {
                System.out.println("None");
            } else {
                failingStudents.forEach(System.out::println);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Got an Error: " + e.getMessage());
            System.out.println("\nPrinting stack trace");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Got an Error: " + e.getMessage());
            System.out.println("\nPrinting stack trace");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Got an Error: " + e.getMessage());
            System.out.println("\nPrinting stack trace");
            e.printStackTrace();
        } catch (InvalidGradeException e) {
            System.out.println("Got an Error: " + e.getMessage());
            System.out.println("\nPrinting stack trace");
            e.printStackTrace();
        }
    }
}
