
public class LinkedListRev {

	static Node head;

	public static Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedListRev list = new LinkedListRev();
		list.head = new Node(65);
		list.head.next = new Node(9);
		list.head.next.next = new Node(2);
		list.head.next.next.next = new Node(10);
		head = list.reverse(head);
		System.out.println("Reversed linked list ");
		printList(head);
	}
}