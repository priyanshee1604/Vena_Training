package com.priyanshee.Collections.handson.model;

import java.util.*;

public class Course {

    private String courseId, courseName, instructorName;
    private int capacity, credits;
    private TreeSet<Student> enrolledStudents;
    private Queue<Student> waitlist;

    public Course(String courseId, String courseName, String instructorName, int capacity, int credits, Comparator<Student> comparator) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.capacity = capacity;
        this.credits = credits;
        this.enrolledStudents = new TreeSet<>(comparator);
        this.waitlist = new LinkedList<>();
    }

    public boolean isFull() {
        return enrolledStudents.size() >= capacity;
    }

    public boolean enrollStudent(Student student) {
        if (enrolledStudents.contains(student) || waitlist.contains(student)) return false;
        if (isFull()) return waitlist.offer(student);
        return enrolledStudents.add(student);
    }

    public boolean dropStudent(Student student) {
        if (enrolledStudents.remove(student)) {
            if (!waitlist.isEmpty()) {
                enrolledStudents.add(waitlist.poll());
            }
            return true;
        } else {
            return waitlist.remove(student);
        }
    }

    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public String getInstructorName() { return instructorName; }
    public int getCapacity() { return capacity; }
    public int getCredits() { return credits; }
    public TreeSet<Student> getEnrolledStudents() { return enrolledStudents; }
    public Queue<Student> getWaitlist() { return waitlist; }

    @Override
    public String toString() {
        return courseId + ": " + courseName + " by " + instructorName + " [" + enrolledStudents.size() + "/" + capacity + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course c = (Course) o;
        return courseId.equals(c.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}

