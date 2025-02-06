package com.itschool.session15.homework.ex3;

public class ExampleA extends Marks {
    private double mark1, mark2, mark3;

    public ExampleA(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    protected double getPercentage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}
