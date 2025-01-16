package com.itschool.session8.homework.ex1;

import java.util.Collections;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);
        String reversedString = stringBuilder.reverse().toString();
        System.out.println("Reversed String: " + reversedString);
    }
}
