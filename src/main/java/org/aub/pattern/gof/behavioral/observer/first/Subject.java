package org.aub.pattern.gof.behavioral.observer.first;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
