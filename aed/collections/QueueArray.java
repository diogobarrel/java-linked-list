package aed.collections;
import java.util.Iterator;

public class QueueArray<T> implements Iterable<T>{
	
	
	private T[] queueArray;
	public int size, head, rear;
	private int max, index;
	
	public QueueArray(int max) {
		this.max = max;
		this.head = null;
		this.rear = null;
		this.index = size-1;
		this.size = 0;
		this.queueArray = new T[size];
		
		
			
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
			throw new OutOfMemoryError();
			
		}
		else {
			queueArray[rear] = item;
			rear++;
			size++;
		}
		return;
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
				queueArray[rear] = 0;
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
	
	
	

}
