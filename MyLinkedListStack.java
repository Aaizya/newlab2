import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private LinkedList<T> stack;

    public MyLinkedListStack() {
        stack = new LinkedList<T>();
    }

    public void pushMethod(T data) // This function add an element to the top of the stack
    {
        stack.addFirst(data);
    }

    public boolean isEmpty() // This function checks that  stack empty and returns true or false
    {
        return stack.isEmpty();
    }

    public void popMethod()    // This function removes and returns the top element of the stack.
    {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stack.removeFirst();
    }

    public T peekMethod() // This function returns the elements but not removing it
    {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.peek();
    }

    public int getSize() // This function returns the number of elements in the stack
    {
        return stack.size();
    }
}



