package org.aub.pattern.gof.behavioral.iterator;

public class ArrayIterator implements Iterator {
    private Object[] array;
    private int index;

    public ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array.length > index;
    }

    @Override
    public Object next() {
        return array[index++];
    }
}
