package org.aub.pattern.gof.behavioral.state;

public class OnState implements State {
    private static State state = new OnState();

    private OnState() {
    }

    public static State getInstance() {
        return state;
    }
    @Override
    public void push(Button button) {
        System.out.println("Turn OFF the button");
        button.setCurrent(OffState.getInstance());
    }

}
