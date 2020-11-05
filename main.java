import aed.collections.StackList;

public class main {
    public static void main(String[] args) {
        StackList obj = new StackList<Integer>(); 
        // insert Stack value 
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        StackList objString = new StackList<String>(); 
        objString.push("44"); 
        objString.push("44");
        
        // print Stack elements 
        var obj2 = obj.shallowCopy(); 
        var obj3 = obj.shallowCopy(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
        System.out.printf("\nTop element is %d\n", obj2.peek()); 
        System.out.printf("\nTop element is %d\n", obj3.peek()); 
  
        // Delete top element of Stack 
        obj.pop(); 
        obj.pop(); 
  
        // print Stack elements 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    }
}