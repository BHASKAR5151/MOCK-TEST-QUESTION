import java.util.Stack;

class TreeTraversal extends Node {

	public TreeTraversal(int item) {
		super(item);
		// TODO Auto-generated constructor stub
	}

	Node root;

	void inorder() {
		if (root == null)
			return;
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		System.out.println( "Inorder Fallow [Left,Root,Right] :");

		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
	}
	void preOrder(Node node) { 
        
        if (node == null) { 
            return; 
        } 
        System.out.println();
        System.out.println( "Pre order Fallow [Root,Left,Right] :");
        Stack<Node> nodeStack = new Stack<Node>(); 
        nodeStack.push(root); 
  
        while (nodeStack.empty() == false) { 
              
            Node mynode = nodeStack.peek();
            System.out.print(mynode.data + " "); 
            nodeStack.pop(); 
  
            if (mynode.right != null) { 
                nodeStack.push(mynode.right); 
            } 
            if (mynode.left != null) { 
                nodeStack.push(mynode.left); 
            } 
        } 
    } 

	public static void main(String args[]) {

		TreeTraversal tree = new TreeTraversal(10);
		tree.root = new Node(8);
		tree.root.left = new Node(23);
		tree.root.right = new Node(13);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(2);
		tree.inorder();
		tree.preorder();
	}
	private void preorder() {
		
		preOrder(root);
	}

	
}