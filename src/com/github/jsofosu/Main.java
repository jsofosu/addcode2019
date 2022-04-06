package com.github.jsofosu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of modules to create");
        int numberOfModules = scan.nextInt();
        List<Module> modules = new ArrayList<>(numberOfModules);

        System.out.println("Enter a List of module mass ");
        for (int i = 0; i < numberOfModules; i++) {
            int mass = scan.nextInt();
            modules.add(new Module(mass));
        }


        System.out.println("Sum of the fuel requirements is " + fuelCounterUpper(modules));
    }

    public static int fuelCounterUpper(List<Module> modules) {
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