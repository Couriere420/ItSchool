package com.itschool.session9.homework.ex1;

import java.time.LocalDate;

public class DisplayingDate {

    public static void main(String[] args) {

        displayTodaysDate();
    }

    public static void displayTodaysDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
    }
}

