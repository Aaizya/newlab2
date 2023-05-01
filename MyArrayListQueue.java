import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    private MyArrayList<T> queue;

    public void enqueue(T data) // This function add data
    {
        queue.add(data);
    }

    public boolean isEmpty()   // This function checks, is queue empty and also  returns true or false
    {
        return queue.isEmpty();
    }

    public T dequeue()   // This function removes and  also returns the front element of the queue
    {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }

    public T peek() // This function returns the front element of the queue without removing it.
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    public int getSize() // This function returns the number of elements in queue.
    {
        return queue.size();
    }
}



