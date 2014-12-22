package org.aub.pattern.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Component {
    private String name;
    private List<Component> childs = new ArrayList();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        childs.add(child);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printInfo() {
        System.out.println("Menu name:" + name);
        for (Component item : childs) {
            item.printInfo();
        }
    }
}
