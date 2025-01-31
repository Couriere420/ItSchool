package com.itschool.session14.hierarchicainheritance;

public class TestHierarchicainHeritance {
    public static void main(String[] args) {
        SpeedBoat yamaha = new SpeedBoat(27, 800, 400, "Turbo-S");
        yamaha.sail();
        yamaha.turboBoost();

        FishingBoat theRedRose = new FishingBoat(15, 500, 250, "Gillnet");
        theRedRose.sail();
        theRedRose.castNet();
    }
}
