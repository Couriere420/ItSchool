package com.itschool.session6.homework.ex5;

public class CycleFor {
    public static void main(String[] args) {

        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Check if the number is even
                System.out.println(i);
            }
        }
    }
}