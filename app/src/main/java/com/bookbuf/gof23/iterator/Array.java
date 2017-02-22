package com.bookbuf.gof23.iterator;

import com.bookbuf.gof23.iterator.impl.ArrayIteratorImpl;

import java.util.Collection;

/**
 * author: robert.
 * date :  2017/2/22.
 */

public class Array<E> implements Iterable<E> {

    private transient Iterator<E> iterator;

    public Array() {
        this.iterator = iterator();
    }

    public Array(Collection<? extends E> collection) {
        this.iterator = iterator();
        this.iterator.addAll(collection);
    }

    @Override
    public Iterator<E> iterator() {
        synchronized (this) {
            if (iterator == null) {
                iterator = new ArrayIteratorImpl<>();
            }
        }
        return iterator;
    }

    public void add(E e) {
        this.iterator.add(e);
    }

    public void addAll(Collection<? extends E> e) {
        this.iterator.addAll(e);
    }

    public void remove(E e) {
        this.iterator.remove(e);
    }

}
