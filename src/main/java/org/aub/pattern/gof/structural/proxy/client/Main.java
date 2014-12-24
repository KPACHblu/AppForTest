package org.aub.pattern.gof.structural.proxy.client;

import org.aub.pattern.gof.structural.proxy.Image;
import org.aub.pattern.gof.structural.proxy.ProxyImage;

/**
 * The Proxy Pattern provides a surrogate or
 * placeholder for another object to control access to it.
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage();
        System.out.println(image.getImageSize());
        System.out.println(image.getImage());
        System.out.println(image.getImageSize());
    }
}
