package org.aub.pattern.gof.behavioral.observer.second;

import java.util.Observable;
import java.util.Observer;

public class IndividualObserver implements Observer {
    private Observable observable;

    public IndividualObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Individual: I've got news:" + o);
    }
}
