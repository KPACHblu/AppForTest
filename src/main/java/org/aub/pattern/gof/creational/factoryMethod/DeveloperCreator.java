package org.aub.pattern.gof.creational.factoryMethod;

public class DeveloperCreator implements Creator {
    @Override
    public Employee factoryMethod() {
        return new Developer();
    }
}
