package LinkedList;

import LinkedList.LinkedList.Node;

abstract class LinkedListBase<T> {
 
    public void create() {}

    public void destroy() {}

    public boolean isFull() {return false; }

    public boolean isEmpty() { return false; }

    public void insert(T item) { }

    public void insert(T item, int index) { }

    public T remove(int index) { return null; }

    public void print() { }

    public Node lastNode() { return null; }
}
