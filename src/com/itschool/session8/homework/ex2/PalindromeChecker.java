package com.itschool.session8.homework.ex2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);
        String reversedString = stringBuilder.reverse().toString();
        if (input.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}
