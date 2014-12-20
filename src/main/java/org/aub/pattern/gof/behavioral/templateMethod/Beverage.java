package org.aub.pattern.gof.behavioral.templateMethod;

public abstract class Beverage {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("Boil water");
    }

    public void pourInCup() {
        System.out.println("Pour in cup");
    }

    public abstract void brew();

    public abstract void addCondiments();
}
