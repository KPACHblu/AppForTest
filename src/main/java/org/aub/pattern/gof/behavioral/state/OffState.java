package org.aub.pattern.gof.behavioral.state;

public class OffState implements State {
    private static State state = new OffState();

    private OffState() {
    }

    public static State getInstance() {
        return state;
    }

    @Override
    public void push(Button button) {
        System.out.println("Turn ON the button");
        button.setCurrent(OnState.getInstance());
    }
}
