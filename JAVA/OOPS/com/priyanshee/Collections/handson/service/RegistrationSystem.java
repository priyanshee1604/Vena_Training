package com.priyanshee.Collections.handson.service;

import com.priyanshee.Collections.handson.model.Course;
import com.priyanshee.Collections.handson.model.Student;

import java.util.*;

public class RegistrationSystem {
    private final Map<String, Course> courses = new HashMap<>();
    private final Map<String, Student> students = new HashMap<>();

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

    public void register(String studentId, String courseId) {
        if (!students.containsKey(studentId)) {
            System.out.println("Invalid student ID: " + studentId);
            return;
        }
        if (!courses.containsKey(courseId)) {
            System.out.println("Invalid course ID: " + courseId);
            return;
        }

        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        boolean enrolled = course.enrollStudent(student);
        if (!enrolled) {
            System.out.println("Student " + student.getName() + " is already enrolled or waitlisted in " + courseId);
        }

    }

    public void drop(String studentId, String courseId) {
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        if (course == null || student == null) return ;
        course.dropStudent(student);
    }

    public void listStudentsInCourseSortedByName(String courseId) {
        Course course = courses.get(courseId);
        if (course != null) {
            List<Student> studentsList = new ArrayList<>(course.getEnrolledStudents());
            studentsList.sort(Comparator.comparing(Student::getName));
            for (Student s : studentsList) {
                System.out.println(s);
            }
        } else {
            System.out.println("Invalid Course ID: " + courseId);
        }
    }

    public void listStudentsByBranch(String branch) {
        boolean found = false;

        for (Course c : courses.values()) {
            for (Student s : c.getEnrolledStudents()) {
                if (s.getBranch().equalsIgnoreCase(branch)) {
                    System.out.println(s + " in " + c.getCourseId());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Invalid Branch: " + branch);
        }
    }

    public void listCoursesSortedByEnrollment() {
        courses.values().stream().sorted((a, b) -> Integer.compare(b.getEnrolledStudents().size(), a.getEnrolledStudents().size())).forEach(System.out::println);
    }

    public void filterCoursesByCredits(int credits) {
        courses.values().stream().filter(c -> c.getCredits() == credits).forEach(System.out::println);
    }

    public void listAllStudents() {
        System.out.println("All Registered Students:");
        students.values().stream().sorted(Comparator.comparing(Student::getName)).forEach(s -> System.out.println(s.getName() + " (" + s.getBranch() + ")"));
    }

    public void filterCoursesByInstructor() {
        Map<String, List<Course>> grouped = new HashMap<>();
        for (Course c : courses.values()) {
            grouped.computeIfAbsent(c.getInstructorName(), k -> new ArrayList<>()).add(c);
        }

        for (Map.Entry<String, List<Course>> entry : grouped.entrySet()) {
            String instructor = entry.getKey();
            List<Course> courseList = entry.getValue();
            System.out.println("Instructor: " + instructor);
            for (Course course : courseList) {
                System.out.println("  - " + course);
            }
        }
    }


    public void printAllCourses() {
        List<Course> courseList = new ArrayList<>(courses.values());
        courseList.sort(Comparator.comparing(Course::getCourseName));
        for (Course c : courseList) {
            System.out.println(c);
        }
    }

    public void printAllBranches() {
        Set<String> branches = new HashSet<>();

        // Loop through all courses and their enrolled students
        for (Course course : courses.values()) {
            for (Student student : course.getEnrolledStudents()) {
                branches.add(student.getBranch());
            }
        }

        branches.forEach(System.out::println);
    }

}
