package org.aub.pattern.gof.behavioral.observer.first;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject implements Subject {
    private String newsData;
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(newsData);
        }
    }

    public String getNewsData() {
        return newsData;
    }

    public void setNewsData(String newsData) {
        this.newsData = newsData;
        notifyObservers();
    }
}
