package com.itschool.session14.multilevelInheritance;

public class Tesla extends ElectricCar {
    private final String autopilotVersion;

    public Tesla(String make, int year, String model, int batteryCapacity, String range, String autopilotVersion) {
        super(make, year, model, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Tesla " + model + " Autopilot " + autopilotVersion + " enabled.");
    }
}

