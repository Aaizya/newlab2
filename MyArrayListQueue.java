import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    private ArrayList<T> queue;

    // Constructor initializes an empty ArrayList queue
    public MyArrayListQueue() {
        queue = new ArrayList<>();
    }

    // Adds the specified element to the end of the queue
    public void enqueue(T element) {
        queue.add(element);
    }

    // Removes and returns the first element from the queue, throws a NoSuchElementException if queue is empty
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    // Returns the first element from the queue without removing it, throws a NoSuchElementException if queue is empty
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    // Returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Returns the number of elements in the queue
    public int size() {
        return queue.size();
    }
}



