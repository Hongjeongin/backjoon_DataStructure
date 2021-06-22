package backjoon_dataStructure_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		Node head = null;
		Node tail = null;
		
		String command = "";
		int lineNum = 0;
		int count = 0;
		
		try {
			lineNum = Integer.parseInt(buffer.readLine());
			
			for (int i = 0; i < lineNum; i++) {
				command = buffer.readLine();
				
				if (command.equals("pop")) {
					if (count == 0) {
						System.out.println("-1");
					} else {
						System.out.println(head.data);
						
						head.prev = null;
						head = head.next;
						
						if (head == null)
							tail = head;
						
						count--;
					}
				} else if (command.equals("size")) {
					System.out.println(count);
				} else if (command.equals("empty")) {
					if (count == 0)
						System.out.println("1");
					else System.out.println("0");
				} else if (command.equals("front")) {
					if (count == 0)
						System.out.println("-1");
					else System.out.println(head.data);
				} else if (command.equals("back")) {
					if (count == 0)
						System.out.println("-1");
					else System.out.println(tail.data);
				} else if (command.split(" ")[0].equals("push")) {
					Node node = new Node();
					node.data = Integer.parseInt(command.split(" ")[1]);
					
					if (count == 0) {
						head = node;
					} else {
						tail.next = node;
						node.prev = tail;
					}
					tail = node;
					count++;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Node {
	public int data;
	public Node next;
	public Node prev;
	
	public Node() {
		data = 0;
		next = null;
		prev = null;
	}
}