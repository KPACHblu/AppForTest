package org.aub.pattern.gof.structural.composite;

public interface Component {
    void addChild(Component child);

    String getName();

    void printInfo();
}
