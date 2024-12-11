package com.itschool.session6.homework.ex3;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age >18){
            System.out.println("I am adult");
        } else if (age <18) {
            System.out.println("I am a child");

        }

    }
}
