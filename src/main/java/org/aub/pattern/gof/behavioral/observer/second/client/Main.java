package org.aub.pattern.gof.behavioral.observer.second.client;

import org.aub.pattern.gof.behavioral.observer.second.CorporateObserver;
import org.aub.pattern.gof.behavioral.observer.second.IndividualObserver;
import org.aub.pattern.gof.behavioral.observer.second.NewsSubject;

import java.util.Observer;

/**
 * It's a java implementation of the observer pattern.
 * There two options of the implementation: push, pull.
 * This example shows push option.
 */
public class Main {
    public static void main(String[] args) {
        NewsSubject newsSubject = new NewsSubject();
        Observer individualObserver = new IndividualObserver(newsSubject);
        Observer corporateObserver = new CorporateObserver(newsSubject);

        newsSubject.setNewsData("There is new film");
    }
}
