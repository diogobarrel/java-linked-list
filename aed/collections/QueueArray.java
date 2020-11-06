package aed.collections;
import java.util.Iterator;
import java.util.Arrays;

public class QueueArray<T> implements Iterable<T>{
	
	private T[] queueArray;
	public int size, head, rear;
	private int max, index;
	
	public QueueArray(int max) {
		this.max = max;
		this.head = head;
		this.rear = rear;
		this.index = size-1;
		this.size = size;
		queueArray = (T[]) new Object[max];			
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
	public void enqueue(T item) {
		if(rear == max) {
			 throw new Exception("OutOfMemoryError");
			
		}
		else {
			queueArray[rear] = item;
			rear++;
			size++;
		}
	}
	
	public T dequeue() {
		if(isEmpty()) {
			return null;
		}
		else {
			for(int i = 0; i < rear -1; i++) {
				queueArray[i] = queueArray[i+1];
			}
			if (rear < max) {
				return queueArray[rear] = null ;
			}
			rear--;
			size--;
		}
		return queueArray[rear];
	}
	
	@Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
  	
      
            @Override
            public boolean hasNext() {
            	return queueArray[head+1] != null;
            }

            @Override
            public T next() {
            	if(isEmpty()) {
            		throw new Error();
            	}
            	for (int i = 0; i < rear-1; i++) {
               	return queueArray[head+i];
            	};             	
             };
        };    
    }
	
	public QueueArray<T> shallowCopy() {
	}
	
	public void main(String[] args) {
		
		QueueArray<T> newTest = (T[]) new Object();
		
		
	}
	
}	
