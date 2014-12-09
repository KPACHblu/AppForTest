package org.aub.pattern.gof.creational.factoryMethod;

public class Manager implements Employee {

    @Override
    public String getDescription() {
        return "Manager";
    }

    @Override
    public long getSalary() {
        return 1000;
    }
}
