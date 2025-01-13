package com.itschool.session7.homework.ex1;

import java.util.Scanner;

public class AdvencedFlowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println(" Odo");

        }
    }
}





