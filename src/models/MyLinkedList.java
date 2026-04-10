package models;
import interfaces.MyList;
import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next, prev;
        MyNode(T data) { this.data = data; }
    }

    private MyNode head, tail;
    private int size;

    public void add(T item) {
        MyNode node = new MyNode(item);
        if (head == null) head = tail = node;
        else { tail.next = node; node.prev = tail; tail = node; }
        size++;
    }

    public void addFirst(T item) {
        MyNode node = new MyNode(item);
        if (head == null) head = tail = node;
        else { node.next = head; head.prev = node; head = node; }
        size++;
    }

    public T get(int index) {
        MyNode curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.data;
    }

    public void remove(int index) {
        MyNode curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        if (curr.prev != null) curr.prev.next = curr.next; else head = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev; else tail = curr.prev;
        size--;
    }

    public void set(int index, T item) {
        MyNode curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        curr.data = item;
    }

    public void add(int index, T item) {
        if (index == 0) addFirst(item);
        else if (index == size) add(item);
        else {
            MyNode curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
            MyNode node = new MyNode(item);
            node.prev = curr.prev; node.next = curr;
            curr.prev.next = node; curr.prev = node;
            size++;
        }
    }

    public void addLast(T item) { add(item); }
    public T getFirst() { return head.data; }
    public T getLast() { return tail.data; }
    public void removeFirst() { remove(0); }
    public void removeLast() { remove(size - 1); }
    public int size() { return size; }
    public void clear() { head = tail = null; size = 0; }

    public void sort() {
        for (int i = 0; i < size; i++) {
            MyNode curr = head;
            while (curr != null && curr.next != null) {
                if (((Comparable<T>)curr.data).compareTo(curr.next.data) > 0) {
                    T tmp = curr.data; curr.data = curr.next.data; curr.next.data = tmp;
                }
                curr = curr.next;
            }
        }
    }

    public int indexOf(Object o) {
        MyNode curr = head;
        for (int i = 0; i < size; i++) { if (curr.data.equals(o)) return i; curr = curr.next; }
        return -1;
    }

    public int lastIndexOf(Object o) {
        MyNode curr = tail;
        for (int i = size - 1; i >= 0; i--) { if (curr.data.equals(o)) return i; curr = curr.prev; }
        return -1;
    }

    public boolean exists(Object o) { return indexOf(o) != -1; }
    public Object[] toArray() {
        Object[] a = new Object[size];
        MyNode curr = head;
        for (int i = 0; i < size; i++) { a[i] = curr.data; curr = curr.next; }
        return a;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            MyNode curr = head;
            public boolean hasNext() { return curr != null; }
            public T next() { T d = curr.data; curr = curr.next; return d; }
        };
    }
}