/*import java.sql.SQLOutput;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        MyArrayList arrLis=new MyArrayList();
        System.out.println(arrLis.size());
        arrLis.add(1);
        arrLis.add(2);
        arrLis.add(3);
        arrLis.add(4);
        arrLis.add(5);
        arrLis.add(6);
        arrLis.add(7);

        System.out.println(arrLis.size());
       arrLis.remove(5);
        System.out.println(arrLis.size());
        System.out.println(arrLis.indexOf(1));
        System.out.println(arrLis.lastIndexOf(1));
        System.out.println("End of checking MyArrayList class");

         next all items are about MyLinkedList class only

        MyLinkedList<String> string = new MyLinkedList<>();
        string.add("SE");
        string.add("MT");
        string.add("BDA");
        string.add("DJ");
        string.add("IT");
        System.out.println("First faculty: "+string.get(1));
        System.out.println("Faculties:" + string.size());

        string.remove(1);




    }
}

 */
import java.sql.SQLOutput;
import java.util.ArrayList;
public class Main {
    public static void Main(String[] args) {
        MyArrayListStack<String> stack = new MyArrayListStack<>();

        // Pushing elements onto the stack
        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");

        // Popping elements from the stack
        System.out.println(stack.pop()); // prints "cherry"
        System.out.println(stack.pop());

        // Peeking at the top element of the stack
        System.out.println(stack.peek()); // prints "apple"

        // Checking if the stack is empty
        System.out.println(stack.isEmpty()); // prints "false"

        // Checking the size of the stack
        System.out.println(stack.size()); // prints "1"
    }
}

