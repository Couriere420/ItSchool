package com.itschool.session14.multilevelInheritance;

public class ElectricCar extends Car {
    protected int batteryCapacity;
    protected String range;

    public ElectricCar(String make, int year, String model, int batteryCapacity, String range) {
        super(make, year, model);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }



    public void charge() {
        System.out.println(make + " " + model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }

}

