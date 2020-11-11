package aed.collections;
import java.util.Iterator;
import java.util.Arrays;
import java.lang.OutOfMemoryError;

public class QueueArray<T> implements Iterable<T>{
	
	private T queueArray[];
	public int size, head, rear;
	private int maxSize;
	
	@SuppressWarnings("unchecked")
	public QueueArray(int max) {
		maxSize = max+1;
		head = 1;
		rear = 0;
		size = 0;
		queueArray = (T[]) new Object[maxSize];			
	}	
	public boolean isEmpty() {
		return size == 0;
		
	}
	
	public int size() {
		return size;
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		return queueArray[rear];

	}
	public void enqueue(T item) throws OutOfMemoryError {
		if(((rear + 2) % maxSize) == head) {
			throw new OutOfMemoryError();
		}
		
		rear = (rear + 1) % maxSize;
		queueArray[rear] = item;
		size++;
	}	
		
	
	
	public T dequeue() {
		if(isEmpty()) {
			return null;
					}
		/*Condicional que seja sempre verdade, enquanto size > 0, visando 
		 *somente retornar rear, sem acabar o resto do método.
		 */
		T dataHead = queueArray[head];
		head = (head + 1) % maxSize;
		return dataHead;	
		}
		
		
	}
	
	@Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
        	
      
            @Override
            public boolean hasNext() {
            	return (((rear + 2) % maxSize) == head);
            }

            @Override
            public T next() {
            	if(!hasNext()) {
            		throw new Error();
            	}
           		
            	T data = queueArray[head+1];
           		head = head + 1;
           		return data;
            	};            	
             };
        };    

	
	public QueueArray<T> shallowCopy() {
		return null;
	}
	
}

