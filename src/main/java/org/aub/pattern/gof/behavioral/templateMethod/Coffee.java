package org.aub.pattern.gof.behavioral.templateMethod;

public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("Brew the coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
