package com.bookbuf.gof23.iterator;

import java.util.Collection;

/**
 * author: robert.
 * date :  2017/2/22.
 */

public interface Iterator<E> {
    boolean hasNext();

    E next();

    boolean add(E e);

    boolean addAll(Collection<? extends E> e);

    boolean remove(E e);
}
