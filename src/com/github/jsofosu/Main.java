package com.github.jsofosu;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }



    public static int fuelCounterUpper(List<Module> modules){
        return modules.stream()
                .mapToInt(Module::calculateFuelRequiredToLaunchModule)
                .sum();
    }

    public static int fuelCounterUpper2(List<Module> modules) {
    return modules.stream()
            .mapToInt(Module::calculateFuelRequiredToLaunchModule)
            .reduce(0, Integer::sum);
    }
}