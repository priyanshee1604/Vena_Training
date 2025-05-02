package com.priyanshee.Collections.question15;

import com.priyanshee.dayone.question6.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentSubject {
    private Map<String, List<String>> studentToSubjects = new HashMap<>();
    private Map<String, List<String>> subjectToStudents = new HashMap<>();

    public void allotSubject(String student, String subject) {
        studentToSubjects.computeIfAbsent(student, k -> new ArrayList<>()).add(subject);
        subjectToStudents.computeIfAbsent(subject, k -> new ArrayList<>()).add(student);
    }

    public void displayStudentToSubject() {
        System.out.println("Subjects choose by a Student");
        studentToSubjects.entrySet().stream().forEach(
                entry -> {
                    System.out.println("Student: " + entry.getKey());
                    System.out.println("Subjects: " + entry.getValue());
                }
        );
    }

    public void displaySubjectToStudents() {
        System.out.println("Subjects choose by a Student");
        subjectToStudents.entrySet().stream().forEach(
                entry -> {
                    System.out.println("Student: " + entry.getKey());
                    System.out.println("Subjects: " + entry.getValue());
                }
        );
    }
}
