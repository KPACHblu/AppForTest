package org.aub.pattern.gof.creational.factoryMethod;

public class Developer implements Employee {
    @Override
    public String getDescription() {
        return "Developer";
    }

    @Override
    public long getSalary() {
        return 1200;
    }
}
