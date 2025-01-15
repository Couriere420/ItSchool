package com.itschool.session6.homework.ex3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        String message = (age >= 18) ? "I am adult" : "I am a child";
        System.out.println(message);

    }
}

