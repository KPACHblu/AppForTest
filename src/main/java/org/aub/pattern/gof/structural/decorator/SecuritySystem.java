package org.aub.pattern.gof.structural.decorator;

public class SecuritySystem extends CarDecorator {

    public SecuritySystem(Car car) {
        super(car);
    }

    @Override
    public long getPrice() {
        return 500 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + security system";
    }
}
