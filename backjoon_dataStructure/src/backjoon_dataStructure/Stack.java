package backjoon_dataStructure;

public class Stack {
	
	private int count;
	private Node head;
	private Node tail;
	
	public Stack() {
		head = null;
		tail = null;
	}
	
	public void push(int n) {
		
		Node node = new Node();
		node.SetN(n);
		
		if (count == 0) {
			node.SetPrev(null);
			node.SetNext(null);
			head = node;
		}
		node.SetPrev(tail);
		tail = node;
		
		count++;
	}
	
	public void pop() {
		if (count == 0) {
			System.out.println(-1);
			return;
		}
		
		tail = tail.GetPrev();
		tail.SetNext(null);
		
		if (head.equals(tail)) {
			head = null;
			tail = null;
		}
		
		System.out.println(tail.GetN());
		count--;
	}
	
	public void size() {
		System.out.println(count);
	}
	
	public void empty() {
		int a;
		a = count == 0 ? -1 : 0;
		System.out.println(a);
	}
	
	public void top() {
		System.out.println(tail.GetN());
	}
}
