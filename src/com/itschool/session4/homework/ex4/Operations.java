package com.itschool.session4.homework.ex4;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Incert first  number");
        int myInt = scanner.nextInt();
        System.out.println("Incert second number");
        int myInt2 = scanner.nextInt();
        int adunare = myInt + myInt2;
        int scadere = myInt - myInt2;
        int inmultire = myInt / myInt2;
        System.out.println("Adunare:" + adunare);
        System.out.println("Scadere:" + scadere);
        System.out.println("Inmultire:" + inmultire);
    }
}
