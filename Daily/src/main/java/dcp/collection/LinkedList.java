package dcp.collection;

public class LinkedList {
	
	Node head;

	public class Node {
		long data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	void printLinkedList(){
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.printLinkedList();
		
		ll.push(40);
		ll.push(50);
		
		java.util.LinkedList<Integer> lList = new java.util.LinkedList<Integer>();
		/*lList.push(10);
		lList.push(20);
		lList.push(30);*/
		
		lList.add(10);
		lList.add(20);
		lList.add(30);
		
		for(Integer i:lList) {
			System.out.println(i);
		}
	}
}
