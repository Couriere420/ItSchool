package com.itschool.session14.hierarchicainheritance;

public class SpeedBoat extends Boat {
    protected int maxSpeed;
    protected String engineType;

    public SpeedBoat(int length, int weight, int maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("SpeedBoat is boosting at " + maxSpeed + " km/h!");

    }
}
