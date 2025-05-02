package com.priyanshee.Collections.question15;

public class Main {
    public static void main(String[] args) {
        StudentSubject studentSubjectMap = new StudentSubject();

        studentSubjectMap.allotSubject("Alice", "Math");
        studentSubjectMap.allotSubject("Alice", "Physics");
        studentSubjectMap.allotSubject("Bob", "Math");
        studentSubjectMap.allotSubject("Charlie", "Chemistry");
        studentSubjectMap.allotSubject("Charlie", "Physics");

        studentSubjectMap.displayStudentToSubject();
        System.out.println();
        studentSubjectMap.displaySubjectToStudents();
    }
}
