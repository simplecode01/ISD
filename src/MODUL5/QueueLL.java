package MODUL5;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueLL<E> {
    private Queue<E> queueList;
    public QueueLL() {
        queueList = new LinkedList<>();
    }
    public void enqueue(E object) {
        queueList.add(object);
    }
    public E dequeue() throws NoSuchElementException {
        return queueList.poll();
    }
    public void printQueue() {
        for (E value : queueList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}

