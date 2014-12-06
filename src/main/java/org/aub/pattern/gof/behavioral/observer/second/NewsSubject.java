package org.aub.pattern.gof.behavioral.observer.second;

import java.util.Observable;

public class NewsSubject extends Observable {

    String newsData;

    public String getNewsData() {
        return newsData;
    }

    public void setNewsData(String newsData) {
        this.newsData = newsData;
        setChanged();
        notifyObservers(newsData);
    }
}
