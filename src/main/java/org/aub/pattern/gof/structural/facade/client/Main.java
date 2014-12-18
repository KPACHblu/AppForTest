package org.aub.pattern.gof.structural.facade.client;

import org.aub.pattern.gof.structural.facade.UserFacade;

/**
 * The Facade pattern provides an unified interface to a set
 * of interfaces in a subsystem. Facade defines a higher level
 * interface that makes the subsystem easier to use.
 */
public class Main {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();
        userFacade.createUser();
    }
}
