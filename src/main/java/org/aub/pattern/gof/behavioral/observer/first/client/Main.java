package org.aub.pattern.gof.behavioral.observer.first.client;

import org.aub.pattern.gof.behavioral.observer.first.CorporateObserver;
import org.aub.pattern.gof.behavioral.observer.first.IndividualObserver;
import org.aub.pattern.gof.behavioral.observer.first.NewsSubject;
import org.aub.pattern.gof.behavioral.observer.first.Observer;

/**
 * The observer pattern defines one-to-many
 * dependency between objects so that when one
 * object changes state, all of its dependents are
 * notified and updated automatically.
 */
public class Main {
    public static void main(String[] args) {
        NewsSubject subject = new NewsSubject();
        Observer corporateObserver = new CorporateObserver(subject);
        Observer individualObserver = new IndividualObserver(subject);

        subject.setNewsData("There is a new film!");
    }
}
