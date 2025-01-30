package com.itschool.session14.homework.singleinheritance;

public class TestSingleInheritance {
    public static void main(String[] args) {
        MountainBike myBike = new MountainBike(10, 3, "Off-road", "Soft");
        myBike.display();
        myBike.changeGear(4);
        myBike.speedUp(5);
        myBike.applyBrake(3);
        myBike.adjustSuspension("Hard");
        myBike.display();
    }
}

