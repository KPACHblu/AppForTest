package org.aub.pattern.gof.behavioral.command.client;

import org.aub.pattern.gof.behavioral.command.*;

/**
 * The Command pattern encapsulates a request as an object,
 * thereby letting you parametrize other objects with different
 * requests, and support undoable operations.
 */
public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command[] commands = {new LightOnCommand(light), new LightOffCommand(light)};

        for (Command command : commands) {
            invoker.setCommand(command);
            invoker.pressButton();
        }
    }
}
