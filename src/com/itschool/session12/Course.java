package com.itschool.session12;

import java.util.ArrayList;
import java.util.List;

class Course {
    String name;
    String schedule;
    String duration;
    String description;
    Professor professor;
    ArrayList<Student> enrolledStudents;

    Course(String name, String schedule, String duration, String description) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.professor = null;
        this.enrolledStudents = new ArrayList<>();
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("Schedule: " + schedule);
        System.out.println("Duration: " + duration);
        System.out.println("Description: " + description);
        if (professor != null) {
            System.out.println("Professor: " + professor.firstName + " " + professor.lastName);
        } else {
            System.out.println("Professor: Not assigned");
        }
        displayEnrolledStudents();
    }

    void displayEnrolledStudents() {
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("Enrolled Students:");
            for (Student student : enrolledStudents) {
                System.out.println(student.firstName + " " + student.lastName);
            }
        }
    }
}