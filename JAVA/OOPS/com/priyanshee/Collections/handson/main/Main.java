package com.priyanshee.Collections.handson.main;

import com.priyanshee.Collections.handson.model.Course;
import com.priyanshee.Collections.handson.model.Student;
import com.priyanshee.Collections.handson.service.RegistrationSystem;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistrationSystem rs = new RegistrationSystem();
        Scanner sc = new Scanner(System.in);

        rs.addStudent(new Student("S01", "Alice", "alice@example.com", "2nd", "CSE"));
        rs.addStudent(new Student("S02", "Bob", "bob@example.com", "2nd", "ECE"));
        rs.addStudent(new Student("S03", "Charlie", "charlie@example.com", "3rd", "CSE"));
        rs.addStudent(new Student("S04", "David", "david@example.com", "3rd", "ME"));
        rs.addStudent(new Student("S05", "Eva", "eva@example.com", "1st", "ECE"));
        rs.addStudent(new Student("S06", "Frank", "frank@example.com", "2nd", "CSE"));
        rs.addStudent(new Student("S07", "Grace", "grace@example.com", "3rd", "EEE"));
        rs.addStudent(new Student("S08", "Hannah", "hannah@example.com", "2nd", "IT"));
        rs.addStudent(new Student("S09", "Ian", "ian@example.com", "1st", "ME"));
        rs.addStudent(new Student("S10", "Jane", "jane@example.com", "3rd", "CSE"));
        rs.addStudent(new Student("S11", "Kevin", "kevin@example.com", "2nd", "ECE"));
        rs.addStudent(new Student("S12", "Laura", "laura@example.com", "1st", "IT"));
        rs.addStudent(new Student("S13", "Mike", "mike@example.com", "4th", "ME"));
        rs.addStudent(new Student("S14", "Nina", "nina@example.com", "2nd", "EEE"));
        rs.addStudent(new Student("S15", "Owen", "owen@example.com", "3rd", "CSE"));
        rs.addStudent(new Student("S16", "Paul", "paul@example.com", "4th", "ECE"));
//        rs.addStudent(new Student("S17", "Quinn", "quinn@example.com", "2nd", "IT"));
        rs.addStudent(new Student("S18", "Rachel", "rachel@example.com", "3rd", "ME"));
        rs.addStudent(new Student("S19", "Steve", "steve@example.com", "1st", "CSE"));
        rs.addStudent(new Student("S20", "Tina", "tina@example.com", "2nd", "EEE"));

        rs.addCourse(new Course("C101", "DSA", "Dr. Smith", 3, 4, Comparator.comparing(Student::getName)));
        rs.addCourse(new Course("C102", "DBMS", "Dr. Lee", 2, 3, Comparator.comparing(Student::getName)));
        rs.addCourse(new Course("C103", "OS", "Dr. Kim", 4, 4, Comparator.comparing(Student::getName)));
        rs.addCourse(new Course("C104", "CN", "Dr. Brown", 2, 3, Comparator.comparing(Student::getName)));
        rs.addCourse(new Course("C105", "ML", "Dr. Watson", 3, 5, Comparator.comparing(Student::getName)));
        rs.addCourse(new Course("C106", "AI", "Dr. Watson", 3, 5, Comparator.comparing(Student::getName)));


        // Fill C101 (capacity: 3) + 2 on waitlist
        rs.register("S01", "C101");
        rs.register("S02", "C101");
        rs.register("S03", "C101");
        rs.register("S04", "C101"); // waitlisted
        rs.register("S05", "C101"); // waitlisted

        // Fill C102 (capacity: 2) + 1 on waitlist
        rs.register("S06", "C102");
        rs.register("S07", "C102");
        rs.register("S08", "C102"); // waitlisted

        // Partially fill C103 (capacity: 4)
        rs.register("S09", "C103");
        rs.register("S10", "C103");

        // Fill C104 (capacity: 2)
        rs.register("S11", "C104");
        rs.register("S12", "C104");

        // Fill C105 (capacity: 3)
        rs.register("S13", "C105");
        rs.register("S14", "C105");
        rs.register("S15", "C105");

        // Additional registrations (variety)
        rs.register("S16", "C103");
//        rs.register("S17", "C103");
        rs.register("S18", "C105"); // waitlisted
        rs.register("S19", "C104"); // waitlisted
        rs.register("S20", "C102"); // waitlisted

        // MENU LOOP
        while (true) {
            System.out.println("\n===== UNIVERSITY COURSE REGISTRATION =====");
            System.out.println("1. Register Student to Course");
            System.out.println("2. Drop Student from Course");
            System.out.println("3. List Students in a Course");
            System.out.println("4. List Courses by Enrollment");
            System.out.println("5. List Students by Branch");
            System.out.println("6. Filter Courses by Instructor");
            System.out.println("7. Filter Courses by Credit");
            System.out.println("8. List All Students with Branch");
            System.out.println("9: List All the Courses");
            System.out.println("10. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("=== Register Student to Course ===");

                    System.out.print("Enter Student ID: ");
                    String sid1 = sc.nextLine();

                    Student student = rs.getStudent(sid1);
                    if (student == null) {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();
                        System.out.print("Enter Year (e.g., 2nd): ");
                        String year = sc.nextLine();
                        System.out.println("Available branches");
                        rs.printAllBranches();
                        System.out.print("Enter Branch: ");
                        String branch = sc.nextLine();

                        student = new Student(sid1, name, email, year, branch);
                        rs.addStudent(student);
                    }

                    System.out.println("Available Courses: C101–C105");
                    System.out.print("Enter Course ID: ");
                    String cid1 = sc.nextLine();

                    rs.register(sid1, cid1);

                    Course course = rs.getCourse(cid1);
                    if (course != null && student != null) {
                        System.out.println("✅ " + student.getName() + " successfully registered in " + course.getCourseName());
                    }

                    break;

                case 2:
                    System.out.print("Enter Student ID to Drop: ");
                    String sid2 = sc.nextLine();
                    System.out.print("Enter Course ID: ");
                    String cid2 = sc.nextLine();
                    Student sDrop = rs.getStudent(sid2);
                    Course cDrop = rs.getCourse(cid2);

                    rs.drop(sid2, cid2);

                    if (sDrop != null && cDrop != null) {
                        System.out.println(sDrop.getName() + " dropped from " + cDrop.getCourseName());
                    }
                    break;

                case 3:
                    System.out.print("Enter Course ID to List Students: ");
                    System.out.println("Available Courses: C101–C105");
                    String cid3 = sc.nextLine();
                    rs.listStudentsInCourseSortedByName(cid3);
                    break;

                case 4:
                    rs.listCoursesSortedByEnrollment();
                    break;

                case 5:
                    System.out.print("Enter Branch (e.g., CSE, ECE): ");
                    String branch = sc.nextLine();
                    rs.listStudentsByBranch(branch);
                    break;

                case 6:
                    System.out.print("Courses by Instructor.");
                    rs.filterCoursesByInstructor();
                    break;

                case 7:
                    System.out.print("Enter Credit Value: ");
                    int credit = sc.nextInt();
                    sc.nextLine(); // flush newline
                    rs.filterCoursesByCredits(credit);
                    break;

                case 8:
                    rs.listAllStudents();
                    break;

                case 9:
                    System.out.println("Listing all the courses available:");
                    rs.printAllCourses();
                    break;

                case 10:
                    System.out.println("Exiting system. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
