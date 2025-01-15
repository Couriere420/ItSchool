package com.itschool.session6.homework.ex7;

public class TrianglesType {
    public static void main(String[] args) {
        int sideOne = 65;
        int sideTwo = 65;
        int sideThree = 65;
        if (sideOne == sideTwo && sideTwo == sideThree) {
            System.out.println("Equilateral");
        } else if (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
