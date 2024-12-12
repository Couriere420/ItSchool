package com.itschool.session4.homework.ex2;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 4 ;
        int y = ++x + 6 / x-- + --x ;
        System.out.println("x este" + x);
        System.out.println("y este" + y);
    }
}
