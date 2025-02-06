package com.itschool.session14.multilevelInheritance;

public class TestMultilevelInheritance {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla("Tesla", 2021,
                "Model-S", 1000, "Sport", "Yes");

        myTesla.start();
        myTesla.accelerate();
        myTesla.enableAutopilot();
        myTesla.stop();
        myTesla.charge();

    }
}
