import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private ArrayList<T> stack;

    // Constructor initializes an empty ArrayList stack
    public MyArrayListStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    // Removes and returns the top element from the stack, throws an EmptyStackException if stack is empty
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Returns the top element from the stack without removing it, throws an EmptyStackException if stack is empty
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return stack.isEmpty();
    }

 // Returns the number of elements in the stack
    public int size() {
        return stack.size();
    }
}




