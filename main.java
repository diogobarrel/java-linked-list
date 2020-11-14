import java.util.Currency;
import java.util.Iterator;

import aed.collections.StackList;
import aed.collections.QueueArray;

public class main {
    public static void main(String[] args) {
    	
    	/*
        QueueArray<String> newTeste = new QueueArray(10);
        Iterator<String> itr = newTeste.iterator();
        Iterator<String> itr2 = newTeste.iterator();

        newTeste.enqueue("Algoritmo");
        newTeste.enqueue("e");
        newTeste.enqueue("Estrutura");
        newTeste.enqueue("De");
        newTeste.enqueue("Dados");

        for (int i = 0; i < newTeste.maxSize; i++) {
            System.out.println(itr.hasNext());
            System.out.println(itr.next());
            System.out.println(itr2.hasNext());
            System.out.println(itr2.next());
        }
        */
        
        StackList<Integer> newStack = new StackList<Integer>();
        Iterator<Integer> itr = newStack.iterator();
        
        // // insert Stack value
        newStack.push(11);
        newStack.push(22);
        newStack.push(33);
        newStack.push(44);
        
        
        
        StackList newStackString = new StackList<String>();
        newStackString.push("44");
        newStackString.push("44");
        
        
        
        
        
        /*
        // // print Stack elements
        var newStack2 = newStack.shallowCopy();
        var newStack3 = newStack.shallowCopy();

        /* print Top element of Stack
        System.out.printf("\nTop element is %d\n", newStack.peek());
        System.out.printf("\nTop element is %d\n", (newStack2).peek());
        System.out.printf("\nTop element is %d\n", newStack3.peek());
        */
        // // Delete top element of Stack
        

        // // print Stack elements

        // // print Top element of Stack
        
        System.out.printf("\nTop element is %d\n", newStack.peek());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(newStack.pop());
        System.out.printf("\nTop element is %d\n", newStack.peek());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(newStack.pop());
        System.out.printf("\nTop element is %d\n", newStack.peek());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(newStack.pop());
        System.out.printf("\nTop element is %d\n", newStack.peek());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(newStack.pop());
        System.out.printf("\nTop element is %d\n", newStack.peek());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(newStack.pop());
        
        
        //aed.collections.StackList$Node@4b1210ee
        

       
         
    }
}