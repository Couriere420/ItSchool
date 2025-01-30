package com.itschool.session14.homework.singleinheritance;

public class MountainBike extends Bicycle {
    private  String tireType;
    private String suspension;

    public MountainBike(int speed, int gear, String tireType, String suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(String newSuspension) {
        this.suspension = newSuspension;
        System.out.println("Suspension adjusted to: " + suspension);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("MountainBike - Tire Type: " + tireType + ", Suspension: " + suspension);
    }
}

