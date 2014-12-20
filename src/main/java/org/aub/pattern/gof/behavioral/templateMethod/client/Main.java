package org.aub.pattern.gof.behavioral.templateMethod.client;

import org.aub.pattern.gof.behavioral.templateMethod.Beverage;
import org.aub.pattern.gof.behavioral.templateMethod.Coffee;
import org.aub.pattern.gof.behavioral.templateMethod.Tea;

/**
 * The Template method pattern defines the skeleton
 * of an algorithm in a method, deferring some steps to
 * subclasses. Template method lets subclasses redefine
 * certain steps of an algorithm without changing the algorithm's structure.
 */
public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.prepareBeverage();

        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
