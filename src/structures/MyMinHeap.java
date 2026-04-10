package structures;
import models.MyArrayList;
public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();
    public void insert(T item) { list.add(item); traverseUp(list.size() - 1); }
    public T extractMin() {
        T min = list.getFirst(); list.set(0, list.getLast()); list.removeLast();
        traverseDown(0); return min;
    }
    private void traverseUp(int i) {
        while (i > 0 && list.get(i).compareTo(list.get((i - 1) / 2)) < 0) {
            swap(i, (i - 1) / 2); i = (i - 1) / 2;
        }
    }
    private void traverseDown(int i) {
        while (2 * i + 1 < list.size()) {
            int j = 2 * i + 1;
            if (j + 1 < list.size() && list.get(j).compareTo(list.get(j + 1)) > 0) j++;
            if (list.get(i).compareTo(list.get(j)) <= 0) break;
            swap(i, j); i = j;
        }
    }
    private void swap(int i, int j) { T t = list.get(i); list.set(i, list.get(j)); list.set(j, t); }
}