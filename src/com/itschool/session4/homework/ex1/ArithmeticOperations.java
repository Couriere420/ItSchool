package com.itschool.session4.homework.ex1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga primul numar");
        int myInt = scanner.nextInt();
        System.out.println("Aduaga al doilea numar");
        int myINt2 = scanner.nextInt();

        int addition = myInt + myINt2;
        int subtraction = myInt - myINt2;
        int multiplication = myInt * myINt2;
        int division = myInt / myINt2;
        int modulus = myInt % myINt2;

        System.out.println("Addition: " + addition );
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);



    }
}
