package com.itschool.session15.homework.ex3;

public class MainTest {
    public static void main(String[] args) {
        Marks marks = new ExampleA(10, 5, 6);
        Marks marks1 = new ExampleB(1, 5, 6, 9);
        System.out.println("Percentage of Student A: " + marks.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + marks1.getPercentage() + "%");

    }

}

