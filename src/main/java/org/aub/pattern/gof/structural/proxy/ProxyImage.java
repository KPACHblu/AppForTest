package org.aub.pattern.gof.structural.proxy;

public class ProxyImage implements Image {
    private Image image;

    @Override
    public String getImage() {
        if (image == null) {
            image = new RemoteImage();
        }
        return image.getImage();
    }

    @Override
    public int getImageSize() {
        int result = 60; // by default
        if (image != null) {
            result = image.getImageSize();
        }
        return result;
    }
}
