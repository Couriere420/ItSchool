package com.itschool.session14.multilevelInheritance;

public class Car {
    protected String make;
    protected String model;
    protected int year;

    public Car(String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
    }

    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println(make + " " + model + " is stopping.");

    }

    public void accelerate() {
        System.out.println(make + " " + model + "is accelerating");

    }
}
