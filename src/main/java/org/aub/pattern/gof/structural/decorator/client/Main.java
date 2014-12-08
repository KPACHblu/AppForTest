package org.aub.pattern.gof.structural.decorator.client;

import org.aub.pattern.gof.structural.decorator.AirConditioner;
import org.aub.pattern.gof.structural.decorator.BaseCar;
import org.aub.pattern.gof.structural.decorator.Car;
import org.aub.pattern.gof.structural.decorator.SecuritySystem;

/**
 * The Decorator pattern attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new SecuritySystem(new AirConditioner(new BaseCar()));
        System.out.println(car.getPrice());
        System.out.println(car.getDescription());
    }
}
