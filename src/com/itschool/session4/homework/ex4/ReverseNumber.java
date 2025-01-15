package com.itschool.session4.homework.ex4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adauga un numar intreg ");
        int number = scanner.nextInt();
        int reversedSignNumber = -number;
        System.out.println("Numărul cu semn inversat este: " + reversedSignNumber);
    }
}
