package solution;

public class SinglyLinkedList<T> {

	public class Node {
		public T data;
		public Node nextNode;
	}

	public Node headNode;
	public int size;

	public SinglyLinkedList() {
		headNode = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (headNode == null)
			return true;

		return false;
	}

	public void insertAtHead(T data) {
		// Creating a new node and assigning it the new data value
		Node newNode = new Node();
		newNode.data = data;
		// Linking head to the newNode's nextNode
		newNode.nextNode = headNode;
		headNode = newNode;
		size++;
	}

	public void insertAtEnd(T data) {

		if (isEmpty()) {
			insertAtHead(data);
			return;
		}

		// Create a new node with the value data
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null;

		Node last = headNode;
		while (last.nextNode != null) {
			last = last.nextNode;
		}
		last.nextNode = newNode;
		size++;

	}

	public void insertAfter(T data, T previous) {
		if (isEmpty()) {
			insertAtHead(data);
			return;
		}

		Node newNode = new Node();
		newNode.data = data;

		Node currentNode = headNode;

		while (currentNode.nextNode != null && currentNode.data != previous) {
			currentNode = currentNode.nextNode;
		}

		if (currentNode != null) {
			newNode.nextNode = currentNode.nextNode;
			currentNode.nextNode = newNode;
			size++;
		}
	}

	public boolean searchNode(T data) {

		if (isEmpty())
			return false;

		Node currentNode = headNode;

		while (currentNode.nextNode != null) {
			if (currentNode.data.equals(data))
				return true;
			currentNode = currentNode.nextNode;
		}

		return false;
	}

	public void deleteAtHead() {
		// if list is empty then simply return
		if (isEmpty())
			return;
		// make the nextNode of the headNode equal to new headNode
		headNode = headNode.nextNode;
		size--;
	}

	public void deleteByValue(T data) {
		if (isEmpty())
			return;

		Node currentNode = headNode;
		Node prevNode = null;

		if (currentNode.data.equals(data)) {
			deleteAtHead();
			return;
		}

		while (currentNode != null) {

			if (data.equals(currentNode.data)) {
				prevNode.nextNode = currentNode.nextNode;
				return;
			}

			prevNode = currentNode;
			currentNode = currentNode.nextNode;
		}
	}

	public void printList() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
			return;
		}

		Node temp = headNode;
		System.out.print("List : ");
		while (temp.nextNode != null) {
			System.out.print(temp.data.toString() + " -> ");
			temp = temp.nextNode;
		}
		System.out.println(temp.data.toString() + " -> null");
	}

}
