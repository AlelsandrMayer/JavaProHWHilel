package net.hliznutsa.hw11;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<T> {
    private List<T> list;

    public ThreadSafeList() {
        this.list = new ArrayList<>();
    }

    public synchronized void add(T element) {
        list.add(element);
    }

    public synchronized void remove(T element) {
        list.remove(element);
    }

    public synchronized T get(int index) {
        return list.get(index);
    }
}

