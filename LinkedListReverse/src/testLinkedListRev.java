import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class testLinkedListRev {

	private Node head;

	@Test
	public void testReverse() {
		testLinkedListRev list = new testLinkedListRev();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		head = LinkedListRev.reverse(list.head);
		assertEquals(20, head.data);
		assertEquals(4, head.next.data);
		assertEquals(15, head.next.next.data);
	}
	
	@Test
	public void testReverse1() {
		testLinkedListRev list = new testLinkedListRev();
		list.head = new Node(5);
		list.head.next = new Node(8);
		head = LinkedListRev.reverse(list.head);
		assertEquals(8, head.data);
		assertEquals(5, head.next.data);
		
	}
	
	@Test
	public void testReverse2() {
		testLinkedListRev list = new testLinkedListRev();
		list.head = new Node(5);
		list.head.next = new Node(8);
		head = LinkedListRev.reverse(null);
		assertEquals(null, head);
		
	}
}
