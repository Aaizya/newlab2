import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue<E> {
    private LinkedList<E> queue; // instance variable of type LinkedList
    public MyLinkedListQueue() {
        queue = new LinkedList<>(); // initializing the LinkedList instance variable
    }
    // Removes and returns the front element of the queue using addLast method
    public void enqueue( E element) {
        queue.add(element);
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NosuchElementException();
        }
        return queue.remove();
      }
    }
}
