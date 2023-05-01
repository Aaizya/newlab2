import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> {
    private LinkedList<E> queue; // instance variable of type LinkedList
    public MyLinkedListQueue() {
        queue = new LinkedList<>(); // initializing the LinkedList instance variable
    }
    // Removes and returns the front element of the queue using addLast method
    public void enqueue(E element) {
        queue.addLast(element);
    }

    // Removes and returns the front element of the queue using removeFirst method
    // Throws NoSuchElementException if queue is empty
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }
    // Returns the front element of the queue without removing it using getFirst method
    // Throws NoSuchElementException if queue is empty
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.getFirst();
    }
    // Returns true if the queue is empty, false otherwise using isEmpty method
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Returns the number of elements in the queue using size method
    public int size() {
        return queue.size();
    }
}