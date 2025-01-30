package com.itschool.session14.homework.singleinheritance;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;

    }

    public void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Gear changed to: " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speed increased to: " + speed + " km/h");
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Speed decreased to: " + speed + " km/h");
    }
    public void display() {
        System.out.println("Bicycle - Speed: " + speed + " km/h, Gear: " + gear);
    }
}
