package backjoon_dataStructure_stack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Node[] nodes = new Node[10001];
		Scanner s = new Scanner(System.in);
		String command = "";
        String temp = "";

		int count = 0;
		int stackSize = 0;
		
		stackSize = s.nextInt();
		s.nextLine();

		for (int i = 0; i < stackSize; i++) {
			
			command = s.nextLine();
			
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
	}
}

class Node {
    public int n;
}