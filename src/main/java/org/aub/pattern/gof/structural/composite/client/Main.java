package org.aub.pattern.gof.structural.composite.client;

import org.aub.pattern.gof.structural.composite.Component;
import org.aub.pattern.gof.structural.composite.Menu;
import org.aub.pattern.gof.structural.composite.MenuItem;

public class Main {
    public static void main(String[] args) {
        Component root = new Menu("Root");

        Component baseMenu = new Menu("Base");
        baseMenu.addChild(new MenuItem("Child menu item"));

        root.addChild(baseMenu);
        root.addChild(new MenuItem("Base menu item"));

        root.printInfo();
    }
}
