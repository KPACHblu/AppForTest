package org.aub.pattern.gof.structural.decorator;

public class AirConditioner extends CarDecorator {
    public AirConditioner(Car car) {
        super(car);
    }

    @Override
    public long getPrice() {
        return 1000 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + air conditioning";
    }
}
