package org.aub.pattern.gof.creational.singleton;

/**
 * Example of lazy Singleton pattern implementation that supports multithreading
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String getProperty() {
        return "Some property";
    }


}
