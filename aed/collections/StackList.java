package aed.collections;
import java.util.Iterator;
  
// Create Stack Using nexted list 
public class StackList<T> implements Iterable<T>{ 
  
    // A nexted list node 
    public class Node<T> { 
  
    	 T data; // node data 
         Node<T> next; // reference variable Node type 
         
         public Node() {
        	 this.data = data;
        	 this.next = next;
        	 
         }
    } 
    // create global top reference variable global 
    Node<T> top;
    int size;
    // Constructor 
    public StackList() 
    { 
        this.top = null; 
        this.size = 0;
        
    } 
  
    // Utility function to add an element x in the stack 
    public void push(T x) // insert at the beginning 
    { 
        // create new node newNode and allocate memory 
        Node<T> newNode = new Node<T>(); 
  
        if (newNode == null) { 
             
            return; 
        } 
  
        // initialize data into newNode data field 
        newNode.data = x; 
  
        // put top reference into newNode next 
        newNode.next = top; 
  
        // update top reference 
        top = newNode; 
        //updating stack size
        size++;
    } 
  
    // Utility function to check if the stack is empty or not 
    public boolean isEmpty() 
    { 
    return top == null;    	
    } 
  
    // Utility function to return top element in a stack 
    
	public T peek() 
    { 
        // check for empty stack 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
        	return null; 
        } 
    } 
  
    // Utility function to pop top element from the stack 
    public T pop() // remove at the beginning 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.print("\nStack Underflow"); 
            return null; 
        } 
        size--;
        return top = (top).next; 
        //updating stack size
        
        
    }
    public int size() {
    	return size;
    	
    }
  /*
    public void display() 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.printf("\nStack Underflow"); 
            exit(1); 
        } 
        else { 
            Node newNode = top; 
            while (newNode != null) { 
  
                // print node data 
                System.out.printf("%d->", newNode.data); 
  
                // assign newNode next to newNode 
                newNode = newNode.next; 
            } 
        } 
    }
	*/
	
        
    public class StackListIterator<T> implements Iterator<T> {

    	Node position;
    	 
    	 public iterator() {
    		position = top;
    		
    		}
    	 @Override
    	public boolean hasNext() {
    		return position != null;
    		   			
    		}
    	}

    	@Override
    	public T next() {
    		if(!hasNext()) {
    			throw new NoSuchElementException();
    		}
    		T value = position.data;
    		position = position.next;
    		return value;
    		
    		
    	
    }

public static void main(String[] args) 
    { 
        // create Object of Implementing class 
        StackList<String> obj = new StackList<String>(); 
  
        
        obj.isEmpty();
  
        obj.peek();
        obj.push("Magrinho");
        obj.push("Magrelo");
        
        
        
        System.out.println(obj.size());
        
        
 
       obj.peek(); 
      
  
       System.out.println(obj.peek()); 
    }



   








} 
