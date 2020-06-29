

public class Node {

	int data;
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
	Node() {
	}
}
