package org.aub.pattern.gof.structural.decorator;

public class BaseCar implements Car {

    @Override
    public long getPrice() {
        return 10000;
    }

    @Override
    public String getDescription() {
        return "Base car";
    }

}
