package aed.collections;
import java.util.Iterator;
import java.util.Arrays;

public class QueueArray<T> implements Iterable<T>{
	
	private T[] queueArray;
	public int size, head, rear;
	private int max;
	
	@SuppressWarnings("unchecked")
	public QueueArray(int max) {
		this.max = max;
		this.head = -1;
		this.rear = -1;
		this.size = 0;
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
		if(size == max) {
			System.out.println("Out of Memory Error!");
		}
		
		else if (isEmpty()) {
			queueArray[0] = item;
			rear++;
			head++;
			size++;
		}
		
		
		else{
			for (int i = 0; i <= size-1; i++) {
				queueArray[i] = queueArray[i+1];
							
			}
			queueArray[head] = item;
			size++;
			rear++;
			
		
		}
	}
	
	public T dequeue() {
		if(isEmpty()) {
			return null;
					}
		/*Condicional que seja sempre verdade, enquanto size > 0, visando 
		 *somente retornar rear, sem acabar o resto do método.
		 */
		else {
			T dataRear = queueArray[rear];
			rear--;
			queueArray[rear+1] = null;
		
			return dataRear;
			
		}
		
		
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

