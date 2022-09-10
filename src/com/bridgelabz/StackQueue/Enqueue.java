package com.bridgelabz.StackQueue;
/**
 * 
 * @author HITESH
 *
 */
public class Enqueue {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Object of LinkedList class
		LinkedList list = new LinkedList();
		// calling methods for Enqueue operation
		list.append(56); // here push performs enqueue operation
		list.append(30);
		list.append(70);
		list.display();
	}
}