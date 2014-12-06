package org.aub.pattern.gof.behavioral.observer.first;

public class CorporateObserver implements Observer {
    private Subject subject;

    public CorporateObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(String newData) {
        System.out.println("Corporate: there are some news:" + newData);
    }
}
