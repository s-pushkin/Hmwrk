package ru.mirea.practice.work2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {
    Queue<T> numbers;

    @Override
    public int size() {
        return numbers.size();
    }

    @Override
    public boolean isEmpty() {
        return numbers.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean a = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.element().equals(o)) {
                a = true;
            }
        }
        return a;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return numbers.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return a;
    }

    @Override
    public boolean add(T t) {
        return numbers.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return numbers.remove(o);
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return numbers.contains(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return numbers.remove(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        numbers.remove(0);
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}
