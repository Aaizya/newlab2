import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private LinkedList<T> stack;
    public MyLinkedListStack()
    {
        stack = new LinkedList<T>();
    }

    public void pushMethod(T data) // This function adds an element to the top of the stack.
    {
        stack.addFirst(data);
    }

    public boolean isEmpty() // This function checks, is stack empty and returns true or false
    {
        return stack.isEmpty();
    }

    public void popMethod()    // This function removes and returns the top element of the stack.
    {
        if (isEmpty())
        {
            throw new EmptyStackException();