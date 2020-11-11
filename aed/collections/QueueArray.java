package aed.collections;

import java.util.Iterator;
import java.lang.OutOfMemoryError;

public class QueueArray<T> implements Iterable<T> {

	private T queueArray[];
	public int size, head, rear;
	private int maxSize;

	@SuppressWarnings("unchecked")
	public QueueArray(int max) {
		size = 0;
		maxSize = max;
		head = 0;
		rear = 0;
		queueArray = (T[]) new Object[maxSize];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public T peek() {
		if (isEmpty()) {
			return null;
		}
		return queueArray[rear];

	}

	public void enqueue(T item)  {
		if (size == maxSize) {
			throw new OutOfMemoryError();
		}
		
		queueArray[rear] = item;
		rear = (rear + 1) % maxSize;
		size++;
		
		
	}

	public T dequeue() {
		if (isEmpty()) {
			return null;
		}
		
		T dataHead = queueArray[head];
		size--;
		head = (head + 1) % maxSize;
		return dataHead;
	}
	
	private class QueueIterator implements Iterator<T> {
		int currentNext;
		
		public QueueIterator() {
			this.currentNext = rear;
		}
		@Override
		public boolean hasNext() {			
			return currentNext != head;
			
		}
			
		

		@Override
		public T next() {
			if (!hasNext()) {
				throw new Error();
			}

			T data = queueArray[head + 1];
			head = head + 1;
			return data;
		};
	}

	@Override
	public Iterator<T> iterator() {
		return new QueueIterator();
	};

	public QueueArray<T> shallowCopy() {
		return null;
	}
}