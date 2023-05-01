#MyLinkListStack
---
__This code is an implementation of a stack data structure using a linked list in Java.__


The class is named MyLinkedListStack and it has a type parameter T for the type of elements that can be stored in the stack.

The constructor initializes an instance of the LinkedList class, which is used to store the elements of the stack.

The pushMethod function adds an element to the top of the stack, which is achieved by calling the addFirst function of the LinkedList class.

The isEmpty function checks whether the stack is empty and returns true if it is, and false otherwise.

The popMethod function removes and returns the top element of the stack. If the stack is empty, an EmptyStackException is thrown.

The peekMethod function returns the top element of the stack without removing it. If the stack is empty, an EmptyStackException is thrown.

The getSize function returns the number of elements in the stack, which is obtained by calling the size function of the LinkedList class.

**Overall, this implementation provides the basic functionalities of a stack data structure and is clear and concise in its implementation.**

````
java.util.LinkedList;
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
````


# MyLinkedListQueue

___This code is an implementation of a queue data structure using a linked list in Java.___

The class is named MyLinkedListQueue and it has a type parameter E for the type of elements that can be stored in the queue.

The constructor initializes an instance of the LinkedList class, which is used to store the elements of the queue.

The enqueue function adds an element to the end of the queue, which is achieved by calling the addLast function of the LinkedList class.

The dequeue function removes and returns the front element of the queue. If the queue is empty, a NoSuchElementException is thrown. This is achieved by calling the removeFirst function of the LinkedList class.

The peek function returns the front element of the queue without removing it. If the queue is empty, a NoSuchElementException is thrown. This is achieved by calling the getFirst function of the LinkedList class.

The isEmpty function checks whether the queue is empty and returns true if it is, and false otherwise.

The size function returns the number of elements in the queue, which is obtained by calling the size function of the LinkedList class.

***Overall, this implementation provides the basic functionalities of a queue data structure and is clear and concise in its implementation.***

````
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
````

# MyArrayListQueue
___This code is an implementation of a queue data structure using an ArrayList in Java.___

The class is named MyArrayListQueue and it has a type parameter T for the type of elements that can be stored in the queue.

The class uses an instance of another class called MyArrayList to store the elements of the queue.

The enqueue function adds an element to the end of the queue, which is achieved by calling the add function of the MyArrayList class.

The isEmpty function checks whether the queue is empty and returns true if it is, and false otherwise.

The dequeue function removes and returns the front element of the queue. If the queue is empty, a NoSuchElementException is thrown. This is achieved by calling the remove function of the MyArrayList class, passing in the index 0.

The peek function returns the front element of the queue without removing it. If the queue is empty, a NoSuchElementException is thrown. This is achieved by calling the get function of the MyArrayList class, passing in the index 0.

The getSize function returns the number of elements in the queue, which is obtained by calling the size function of the MyArrayList class.
````
mport java.util.LinkedList;
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

````

# MyArrayListStack
MyArrayListStack is a class that represents a stack data structure using ArrayList. A stack is a collection of elements that supports two main operations: push and pop. The push operation adds an element to the top of the stack, and the pop operation removes and returns the top element from the stack. Additionally, ___MyArrayListStack___ provides a peek operation that returns the top element without removing it, an isEmpty operation that checks if the stack is empty, and a size operation that returns the number of elements in the stack.
````
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
````
