package com.itschool.session14.hierarchicainheritance;

public class FishingBoat extends Boat {
    protected final int fishCapacity;
    protected final String typeOfNet;

    public FishingBoat(int length, int weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("Casting the :" + typeOfNet + " net.");
    }
}
