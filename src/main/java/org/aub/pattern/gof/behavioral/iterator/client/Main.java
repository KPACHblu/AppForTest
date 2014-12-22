package org.aub.pattern.gof.behavioral.iterator.client;

import org.aub.pattern.gof.behavioral.iterator.ArrayIterator;
import org.aub.pattern.gof.behavioral.iterator.Iterator;

/**
 * The Iterator Pattern provides a way to access
 * the elements of an aggregate object
 * sequentially without exposing its underlying
 * representation.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 4, 7, 0, 20, 101, -1};
        Iterator iterator = new ArrayIterator(intArray);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
