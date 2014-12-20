package org.aub.pattern.gof.behavioral.templateMethod;

public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("Brew the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar and lemon");
    }
}
