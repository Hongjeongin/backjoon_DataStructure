package backjoon_dataStructure_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Node[] nodes = new Node[10001];
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String command = "";
        String temp = "";

		int count = 0;
		int stackSize = 0;
		
		try {
			stackSize = Integer.parseInt(buffer.readLine());
			
			for (int i = 0; i < stackSize; i++) {
				command = buffer.readLine();
				if (command.equals("pop")) {
					if (count == 0) {
						System.out.println("-1");
					} else {
						System.out.println(nodes[count - 1].n);
						count--;
					}
				} else if (command.equals("size")) {
					System.out.println(count);
				} else if (command.equals("empty")) {
					if (count == 0) {
						System.out.println("1");
					} else
						System.out.println("0");
				} else if (command.equals("top")) {
					if (count == 0) {
						System.out.println("-1");
					} else
						System.out.println(nodes[count - 1].n);
				} else if (command.split(" ")[0].equals("push")) {
					nodes[count] = new Node();
					nodes[count].n = Integer.parseInt(command.split(" ")[1]);
					count++;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

class Node {
    public int n;
}