package q2;

public class Node {
	private Node leftChild, rightChild, parent;
	private int key, height, balance;
	private int sizeOfSubtree;
	
	public Node(int key) {
		this.key = key;
		leftChild = rightChild = parent = null;
	}
	
	public Node(int key, Node leftChild, Node rightChild, Node parent) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
		this.key = key;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSizeOfSubtree() {
		return sizeOfSubtree;
	}

	public void setSizeOfSubtree(int sizeOfSubtree) {
		this.sizeOfSubtree = sizeOfSubtree;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}