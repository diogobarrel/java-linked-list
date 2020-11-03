package aed.collections;


import java.util.Iterator;


public class LinkedList<T> implements Iterable<T> {

	private int size;
	private Node<T> head = null;
	private Node<T> tail = null;
	
	
	private static class Node<T> {
		
		private T data;
		private Node<T> next;
		
		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return data.toString();
			}
		
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void addFirst(T elem) {
		if(isEmpty()) {
		head = new Node<T>(elem, null);
		}
		else {
		head = new Node<T>(elem, head.next);
		}
		size++;
	}
	
	public T getFirst() {
		return head.data;
		}
	public T getLast() {
		return tail.data;
	}
	

		
	public static void main(String[] args) {
		
		LinkedList<Integer> LinkedList = new LinkedList <Integer>();
		
		LinkedList.addFirst(10);
		LinkedList.addFirst(12);
		LinkedList.addFirst(14);
		LinkedList.addFirst(2);
				
		
		System.out.println(LinkedList.size);
		System.out.println(LinkedList.isEmpty());
		System.out.println(LinkedList.size);
		System.out.println(LinkedList.head.next);
		System.out.println(LinkedList.getFirst());
					
		
	}
}
