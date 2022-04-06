package com.github.jsofosu;

public class Module {
    private int mass;

    public Module(int mass) {
        this.mass = mass;
    }

    public int calculateFuelRequiredToLaunchModule() {
        return mass / 3 - 2;
    }
}
