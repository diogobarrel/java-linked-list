package aed.collections;

import java.util.Iterator;

// Create Stack Using nexted list 
public class StackList<T> {

    // A nexted list node
    public class Node<T> {
        public Node<T> next = null;
        public int index;
        public T data;

        public Node(T data) {
            this.data = data;
        }
    }

    // create global top reference variable global
    Node<T> top;
    int size;

    // Constructor
    public StackList() {
        this.top = null;
        this.size = 0;
    }

    public Iterator<T> Iterator() {
        return new Iterator<T>() {

            private Node<T> currentNode = null;

            @Override
            public boolean hasNext() {
                return currentNode != top;
            }

            @Override
            public T next() {
                if (currentNode == null) {
                    return currentNode.data;
                }
                if (currentNode.next == null) {
                    throw new Error();
                }
                currentNode = currentNode.next;
                return currentNode.data;
            };
        };
    }

    // Utility function to add an element x in the stack
    public void push(T x) {  // insert at the beginning
        // create new node newNode and allocate memory
        Node<T> newNode = new Node<T>(x);

        if (newNode == null) {
            return; // stack underflow
        }

        // put top reference into newNode next
        newNode.next = top;
        // update top reference
        top = newNode;
        // updating stack size
        size++;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public T peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }

        return null;
    }

    // Utility function to pop top element from the stack
    public T pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            return null;
        }

        size--; // updating stack size
        var topData = top.data;
        top = top.next;
        return topData;

    }

    public int size() {
        return size;

    }

    public static void main(String[] args) {
        // create Object of Implementing class
        StackList<String> obj = new StackList<String>();
        obj.isEmpty();
        obj.peek();
        obj.push("Magrinho");
        System.out.println(obj.size());
        System.out.println(obj.peek());
        obj.push("Magrelo");
        System.out.println(obj.size());
        System.out.println(obj.peek());
    }
}
