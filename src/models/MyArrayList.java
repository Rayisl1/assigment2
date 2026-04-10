package models;
import interfaces.MyList;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    private void grow() {
        Object[] newArr = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArr, 0, size);
        elements = newArr;
    }

    public void add(T item) {
        if (size == elements.length) grow();
        elements[size++] = item;
    }

    public T get(int index) { return (T) elements[index]; }

    public void set(int index, T item) { elements[index] = item; }

    public void add(int index, T item) {
        if (size == elements.length) grow();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = item;
        size++;
    }

    public void addFirst(T item) { add(0, item); }
    public void addLast(T item) { add(item); }
    public T getFirst() { return get(0); }
    public T getLast() { return get(size - 1); }

    public void remove(int index) {
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void removeFirst() { remove(0); }
    public void removeLast() { size--; }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>)elements[j]).compareTo((T)elements[j+1]) > 0) {
                    Object tmp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = tmp;
                }
            }
        }
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) if (elements[i].equals(o)) return i;
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) if (elements[i].equals(o)) return i;
        return -1;
    }

    public boolean exists(Object o) { return indexOf(o) != -1; }
    public Object[] toArray() {
        Object[] a = new Object[size];
        System.arraycopy(elements, 0, a, 0, size);
        return a;
    }
    public void clear() { size = 0; }
    public int size() { return size; }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int cursor = 0;
            public boolean hasNext() { return cursor < size; }
            public T next() { return get(cursor++); }
        };
    }
}