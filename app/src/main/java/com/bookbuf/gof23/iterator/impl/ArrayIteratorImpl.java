package com.bookbuf.gof23.iterator.impl;

import com.bookbuf.gof23.iterator.Iterator;

import java.util.Arrays;
import java.util.Collection;

/**
 * author: robert.
 * date :  2017/2/22.
 */

public class ArrayIteratorImpl<E> implements Iterator<E> {

    private transient Object[] elementData = {};
    private transient static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    protected transient int modCount = 0;
    private int size;

    int cursor;       // index of next element to return
    int lastRet = -1; // index of last element returned; -1 if no such

    private void ensureCapacityInternal(int minCapacity) {
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }

        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        // overflow-conscious code
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public E next() {
        int i = cursor;
        if (i >= size)
            throw new IllegalArgumentException("");
        Object[] elementData = this.elementData;
        if (i >= elementData.length)
            throw new IllegalArgumentException();
        cursor = i + 1;
        return (E) elementData[lastRet = i];
    }

    @Override
    public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        lastRet = -1;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> e) {
        final Object[] a = e.toArray();
        final int numNew = e.size();
        ensureCapacityInternal(this.size + numNew);
        System.arraycopy(a, 0, elementData, size, numNew);
        this.size += numNew;
        lastRet = -1;
        return numNew != 0;
    }

    @Override
    public boolean remove(E o) {
        lastRet = -1;
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    private void fastRemove(int index) {
        modCount++;
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index + 1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work
    }

}
