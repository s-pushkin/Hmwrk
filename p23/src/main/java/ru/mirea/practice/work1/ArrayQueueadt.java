package ru.mirea.practice.work1;

abstract class ArrayQueueadt {
    private int size;
    private int[] items;
    private int front;
    private int rear;

    public int getSize() {
        return size;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int[] getItems() {
        return items;
    }

    abstract int getElement(int index);

    abstract boolean isFull();

    abstract boolean isEmpty();

    abstract void enqueue(int element);

    abstract int dequeue();

    abstract void element();

    abstract void size();

    abstract void clear();

    abstract void display();
}
