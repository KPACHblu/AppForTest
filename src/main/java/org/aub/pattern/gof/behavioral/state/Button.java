package org.aub.pattern.gof.behavioral.state;

public class Button {
    private State current = OffState.getInstance();

    public void setCurrent(State current) {
        this.current = current;
    }

    public void push() {
        current.push(this);
    }
}
