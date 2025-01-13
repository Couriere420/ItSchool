package com.itschool.session6.homework.ex6;

public class TemperatureOperations {
    public static void main(String[] args) {
        int temperature = 18 ;
        if (temperature > 30 ) {
            System.out.println("Hot");
        } else if ( temperature >= 20 && temperature <= 30){
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
