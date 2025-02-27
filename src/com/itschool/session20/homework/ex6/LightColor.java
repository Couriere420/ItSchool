package com.itschool.session20.homework.ex6;

public enum LightColor {
    RED("Stop ", 30),
    YELLOW("Caution ", 5),
    GREEN("Go ", 45);

    private final String action;
    private final int duration;

    LightColor(String action, int duration) {
        this.action = action;
        this.duration = duration;
    }


    public String getAction() {
        return action;
    }

    public int getDuration() {
        return duration;
    }

}
