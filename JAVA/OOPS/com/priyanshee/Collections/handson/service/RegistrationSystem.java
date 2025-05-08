package com.priyanshee.Collections.handson.service;

import com.priyanshee.Collections.handson.model.Course;
import com.priyanshee.Collections.handson.model.Student;

import java.util.*;

public class RegistrationSystem {
    private Map<String, Course> courses = new HashMap<>();
    private Map<String, Student> students = new HashMap<>();

    public Student getStudent(String sid) {
        return students.get(sid);
    }

    public Course getCourse(String courseId) {
        return courses.get(courseId);
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public boolean register(String studentId, String courseId) {
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        if (course == null || student == null) return false;
        return course.enrollStudent(student);
    }

    public boolean drop(String studentId, String courseId) {
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        if (course == null || student == null) return false;
        return course.dropStudent(student);
    }

    public void listStudentsInCourse(String courseId) {
        Course course = courses.get(courseId);
        if (course != null) {
            for (Student s : course.getEnrolledStudents()) {
                System.out.println(s);
            }
        }
    }

    public void listStudentsByBranch(String branch) {
        for (Course c : courses.values()) {
            for (Student s : c.getEnrolledStudents()) {
                if (s.getBranch().equalsIgnoreCase(branch)) {
                    System.out.println(s + " in " + c.getCourseId());
                }
            }
        }
    }

    public void listCoursesSortedByEnrollment() {
        courses.values().stream().sorted((a, b) -> Integer.compare(b.getEnrolledStudents().size(), a.getEnrolledStudents().size())).forEach(System.out::println);
    }

    public void filterCoursesByInstructor(String instructor) {
        courses.values().stream().filter(c -> c.getInstructorName().equalsIgnoreCase(instructor)).forEach(System.out::println);
    }

    public void filterCoursesByCredits(int credits) {
        courses.values().stream().filter(c -> c.getCredits() == credits).forEach(System.out::println);
    }

    public void listAllStudents() {
        System.out.println("All Registered Students:");
        students.values().stream().sorted(Comparator.comparing(Student::getName)).forEach(s -> System.out.println(s.getName() + " (" + s.getBranch() + ")"));
    }
}
