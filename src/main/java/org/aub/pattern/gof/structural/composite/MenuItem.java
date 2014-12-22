package org.aub.pattern.gof.structural.composite;

public class MenuItem implements Component {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printInfo() {
        System.out.println("Name:" + name);
    }
}
