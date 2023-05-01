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
    public T dequeue ()   // This function removes and  also returns the front element of the queue
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.remove(0);
    }
    public T peek()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    public int getsize()
    {
        return queue.size();
    }


