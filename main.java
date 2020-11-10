import aed.collections.QueueArray;

public class main {
    public static void main(String[] args) {
    	
    	QueueArray<String> queueArray = (QueueArray<String>) new QueueArray(2);
		QueueArray<String> newTeste = queueArray;
    	   	
    	
    	newTeste.enqueue("Cabeça");
    	newTeste.enqueue("de Mamona");
    	
    }
}