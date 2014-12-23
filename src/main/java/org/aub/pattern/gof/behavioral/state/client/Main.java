package org.aub.pattern.gof.behavioral.state.client;

import org.aub.pattern.gof.behavioral.state.Button;

/**
 * The State Pattern allows an object to alter
 * its behaviour when its internal state changes.
 * The object will appear to change its class.
 */
public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.push();
        button.push();
    }
}
