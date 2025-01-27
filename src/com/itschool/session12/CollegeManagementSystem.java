package com.itschool.session12;

import java.util.ArrayList;

public class CollegeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> enrolledStudents = new ArrayList<>();
        ArrayList<Professor> professors = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course("Math", "Monday 9AM", "3 months",
                "Learn about algebra and calculus"));
        courses.add(new Course("Computer Science", "Wednesday 10AM", "4 months",
                "Introduction to programming"));
        courses.add(new Course("Physics", "Friday 1PM", "3 months",
                "Study the laws of physics"));
        courses.add(new Course("Chemistry", "Thursday 11AM", "3 months",
                "Explore chemical reactions"));
        courses.add(new Course("Biology", "Tuesday 10AM", "3 months",
                "Learn about living organisms"));
        courses.add(new Course("Geography", "Monday 11AM", "3 months",
                "Study the earth's landscapes"));
        courses.add(new Course("English", "Wednesday 1PM", "3 months",
                "Improve your language skills"));
        courses.add(new Course("History", "Friday 10AM", "3 months",
                "Understand historical events"));

        Professor professor1 = new Professor("Dave", "Martins", "Male", 40,
                "1983-05-15", "123456789", "123 Main St");
        Professor professor2 = new Professor("Calvin", "Klein", "Male", 44,
                "1979-06-30", "987654321", "Rue St-Julien");

        professors.add(professor2);
        professors.add(professor1);

        Student student = new Student("John", "Clark", "Male", 22,
                "1996-06-12", "123456789", "Hight Avenue 15");
        Student student1 = new Student("Alice", "Smith", "Female", 20,
                "2003-04-12", "987654321", "456 Elm St");

        enrolledStudents.add(student);
        enrolledStudents.add(student1);

        courses.get(0).enrollStudent(student);
        courses.get(1).enrollStudent(student1);

        courses.get(0).assignProfessor(professor1);
        courses.get(1).assignProfessor(professor2);

        for (Course course : courses) {
            course.displayCourseDetails();
            System.out.println();

        }
    }
}


