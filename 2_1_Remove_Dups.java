package Model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Node {
	int data;
	Node next;
}

class LL {
	public Node add(Node head, int data) {
		Node h = head;
		if(head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
			h = head;
		} else {
			Node prev = head;
			while(head != null) {
				prev = head;
				head = head.next;
			}
			
			Node newNode = new Node();
			prev.next = newNode;
			newNode.data = data;
			newNode.next = null;
		}
		return h;
	}
	
	public void displayList(Node head) {
		while(head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	void removeDuplicates(Node head) {
		Set<Integer> ss = new HashSet<>();
		Node prev = head;
		while(head != null) {
			if(ss.contains(head.data) == false) {
				ss.add(head.data);
			} else {
				prev.next = prev.next.next;
			}
			prev = head;
			head = head.next;
		}
	}
}


public class Ex2 {
	
	public static void main(String []args) {
		LL ll = new LL();
		Node h = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			h = ll.add(h, (int) (Math.random() * 1000) % n);
		}
		ll.displayList(h);
		ll.removeDuplicates(h);
		ll.displayList(h);
	}
}
