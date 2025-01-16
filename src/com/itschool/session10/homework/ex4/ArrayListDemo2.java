package com.itschool.session10.homework.ex4;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 5, 8, 10, 3, 17, 20, 6, 9};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;

            }
        }
        System.out.println("EvenCount:" + evenCount);
        System.out.println("OddCount:" + oddCount);
    }
}
