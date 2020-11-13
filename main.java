import java.util.Iterator;
import aed.collections.StackList;
import aed.collections.QueueArray;

public class main {
    public static void main(String[] args) {

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
        // StackList obj = new StackList<Integer>();
        // // insert Stack value
        // obj.push(11);
        // obj.push(22);
        // obj.push(33);
        // obj.push(44);

        // StackList objString = new StackList<String>();
        // objString.push("44");
        // objString.push("44");

        // // print Stack elements
        // var obj2 = obj.shallowCopy();
        // var obj3 = obj.shallowCopy();

        // // print Top element of Stack
        // System.out.printf("\nTop element is %d\n", obj.peek());
        // System.out.printf("\nTop element is %d\n", (obj2).peek());
        // System.out.printf("\nTop element is %d\n", obj3.peek());

        // // Delete top element of Stack
        // obj.pop();
        // obj.pop();

        // // print Stack elements

        // // print Top element of Stack
        // System.out.printf("\nTop element is %d\n", obj.peek());
        // var a = new Object();
        // System.out.println(a);
        // if ((Boolean) a) {
        // System.out.println("Verdade");
        // } else {
        // System.out.println("Falso");
        // }

    }
}