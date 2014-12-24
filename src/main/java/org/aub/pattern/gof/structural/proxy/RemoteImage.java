package org.aub.pattern.gof.structural.proxy;

public class RemoteImage implements Image {
    @Override
    public String getImage() {
        return "Remote image";
    }

    @Override
    public int getImageSize() {
        return 100;
    }
}
