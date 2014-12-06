package org.aub.pattern.gof.behavioral.observer.second;

import java.util.Observable;
import java.util.Observer;

public class CorporateObserver implements Observer {
    private Observable observable;

    public CorporateObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Corporate: there are some news:" + o);
    }
}
