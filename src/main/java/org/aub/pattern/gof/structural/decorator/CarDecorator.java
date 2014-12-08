package org.aub.pattern.gof.structural.decorator;

public class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public long getPrice() {
        return car.getPrice();
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }
}
