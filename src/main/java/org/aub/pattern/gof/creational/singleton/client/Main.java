package org.aub.pattern.gof.creational.singleton.client;

import org.aub.pattern.gof.creational.singleton.Singleton;

/**
 * The Singleton pattern ensures a class has only
 * one instance and provides a global point of access to it.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getProperty());
    }
}
