package com.itschool.session20.homework.ex6;

public class MainForEnum {
    public static void main(String[] args) {
        for (LightColor lightColor: LightColor.values()){
            System.out.println(lightColor.name() + " - " + lightColor.getAction() + "for: " +
                    lightColor.getDuration() + "seconds");
        }
    }
}
