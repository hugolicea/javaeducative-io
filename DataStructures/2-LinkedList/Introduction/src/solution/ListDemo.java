package solution;

import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		sll.printList();
		for (int i = 1; i <= 3; i++) {
			sll.insertAtHead(i);
			sll.printList();
		}

		for (int i = 4; i <= 5; i++) {
			sll.insertAtEnd(i);
			sll.printList();
		}

		System.out.println("\nInserting 8 after 2");
		sll.insertAfter(16, 2);
		sll.printList(); // calling insert after
		System.out.println("\nInserting 18 after 3");
		sll.insertAfter(18, 3); // calling insert after
		sll.printList();

		System.out.println(sll.searchNode(4));

		sll.deleteByValue(4);
		System.out.println("\nDeleting 4");
		sll.printList();

		System.out.println(sll.searchNode(4));

		LinkedList<String> list = new LinkedList<>();

		list.add("Hugo");
		list.add("Enrique");
		list.add("Licea");
		list.add("Leon");
		list.add("otro");

		System.out.println(list);

		list.remove(2);
		System.out.println(list);

	}

}
