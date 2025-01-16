package com.itschool.session10.homework.ex3;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.add("Ion");
        studentList.add("Denis");
        studentList.add("Constantin");
        studentList.add("Alex");
        studentList.add("Diana");
        studentList.add("Fiona");
        studentList.add("George");
        studentList.add("Teodor");
        studentList.add("Ian");
        studentList.add("Vasile");

        graduateStudentList.addAll(studentList);
        System.out.println("Graduated Students:");

        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
