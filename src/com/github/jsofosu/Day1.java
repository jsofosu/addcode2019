package com.github.jsofosu;

import java.util.List;

public class Day1 {
    public  int fuelCounterUpper(List<Module> modules) {
        return modules.stream()
                .mapToInt(Module::calculateFuelRequiredToLaunchModule)
                .sum();
    }

    public  int fuelCounterUpper2(List<Module> modules) {
        return modules.stream()
                .mapToInt(Module::calculateFuelRequiredToLaunchModule)
                .reduce(0, Integer::sum);
    }
}
