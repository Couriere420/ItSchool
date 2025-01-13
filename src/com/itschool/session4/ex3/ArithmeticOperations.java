package com.itschool.session4.ex3;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga lungimea dreptunghiului");
        int firstNumber = scanner.nextInt();
        System.out.println("Adauga latimea dreptunghiului");
        int lastNumber = scanner.nextInt();
        int area = (firstNumber * lastNumber);
        System.out.println("Area dreptunghiului este "+ area);

    }
}
