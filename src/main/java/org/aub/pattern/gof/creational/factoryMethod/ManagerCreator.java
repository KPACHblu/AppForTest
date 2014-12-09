package org.aub.pattern.gof.creational.factoryMethod;

public class ManagerCreator implements Creator {
    @Override
    public Employee factoryMethod() {
        return new Manager();
    }
}
