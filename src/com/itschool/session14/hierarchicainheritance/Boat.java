package com.itschool.session14.hierarchicainheritance;

public class Boat {
    protected int length;
    protected int weight;

    public Boat(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("The boat is sailing");
    }
}
