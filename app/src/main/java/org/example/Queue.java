package org.example;

public class Queue <T> {
    private int array_size;
    private T[] array;
    private int size;
    private int pos;
    Queue(int array_size) {
        this.array_size = array_size;
        array = (T[]) new Object[array_size];
        size = 0;
        pos = 0;
    }
    void enqueue(T data) {
        if(full()) {
            System.out.println("Full queue");
        } else {
            array[(pos + size++)%array_size] = data;
        }
    }
    T dequeue() {
        if(size == 0) {
            throw new NegativeArraySizeException();
        }
        size--;
        T data = array[pos];
        pos = (pos + 1) % array_size;
        return data;
    }
    void clear() {
        size = 0;
    }
    boolean full() {
        return size >= array_size;
    }
    int size() {
        return size;
    }
}
