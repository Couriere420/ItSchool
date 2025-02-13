package com.itschool.session15.homework.ex3;

public class ExampleB extends Marks {
    private final double mark1;
    private final double mark2;
    private final double mark3;
    private final double mark4;

    public ExampleB(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    protected double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;


    }
}
