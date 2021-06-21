package backjoon_dataStructure;

public class Node {
	private int n;
	private Node next;
	private Node prev;
	
	public void SetN(int n) {
		this.n = n;
	}
	public int GetN() {
		return this.n;
	}
	
	public void SetNext(Node node) {
		this.next = node;
	}
	public Node GetNext()
	{
		return this.next;
	}
	
	public void SetPrev(Node node) {
		this.prev = node;
	}
	public Node GetPrev() {
		return this.prev;
	}
}