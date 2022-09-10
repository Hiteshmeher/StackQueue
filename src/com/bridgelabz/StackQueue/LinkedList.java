package com.bridgelabz.StackQueue;

public class LinkedList {

	Node head;
	Node tail;
	
	public void display() {
		/**
		 * displaying the data(s) from node(s)
		 */
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("\n");
	}

	public void push(int data) {
		/**
		 * adding values
		 */
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public Node search(int data) {
		/**
		 * searching all data with value given
		 */
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
		return null;
	}
}