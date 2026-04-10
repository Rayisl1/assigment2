import interfaces.MyList;
import models.MyArrayList;
import models.MyLinkedList;
import structures.MyStack;
import structures.MyQueue;
import structures.MyMinHeap;

public class Main {
    public static void main(String[] args) {
        testList(new MyArrayList<Integer>());
        testList(new MyLinkedList<Integer>());
        testStack();
        testQueue();
        testHeap();
    }

    private static void testList(MyList<Integer> list) {
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.add(1, 15);
        list.sort();

        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println("| Size: " + list.size());

        list.remove(0);
        list.clear();
    }

    private static void testStack() {
        MyStack<String> stack = new MyStack<>();
        stack.push("A");
        stack.push("B");
        System.out.println("Stack Pop: " + stack.pop());
    }

    private static void testQueue() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Queue Dequeue: " + queue.dequeue());
    }

    private static void testHeap() {
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(50);
        heap.insert(10);
        heap.insert(30);
        heap.insert(5);
        System.out.println("Min Heap Extract: " + heap.extractMin());
    }
}