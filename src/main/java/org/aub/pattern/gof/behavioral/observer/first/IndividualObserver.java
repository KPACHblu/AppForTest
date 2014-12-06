package org.aub.pattern.gof.behavioral.observer.first;

public class IndividualObserver implements Observer {
    private Subject subject;

    public IndividualObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(String newData) {
        System.out.println("Individual: I've got news:" + newData);
    }
}
