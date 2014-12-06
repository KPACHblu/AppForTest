package org.aub.pattern.gof.behavioral.strategy.client;

import org.aub.pattern.gof.behavioral.strategy.Knigh;
import org.aub.pattern.gof.behavioral.strategy.Troll;

/**
 * The strategy pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 */
public class Main {
    public static void main(String[] args) {
        new Knigh().fight();
        new Troll().fight();
    }
}
