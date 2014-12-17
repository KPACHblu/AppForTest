package org.aub.pattern.gof.structural.adapter.client;

import org.aub.pattern.gof.structural.adapter.Adapter;
import org.aub.pattern.gof.structural.adapter.NewFunctionality;
import org.aub.pattern.gof.structural.adapter.OldFunctionality;

/**
 * The Adapter pattern converts the interface of a class
 * into another interface the client expects. Adapter lets classes
 * work together that couldn't otherwise because of incompatible interfaces.
 */
public class Main {

    public static void main(String[] args) {
        OldFunctionality oldFunctionality = new OldFunctionality();
        NewFunctionality someInstance = new Adapter(oldFunctionality);
        System.out.println(someInstance.getInfo());
    }
}
