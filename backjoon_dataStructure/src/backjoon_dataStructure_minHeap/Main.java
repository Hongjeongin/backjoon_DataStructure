package backjoon_dataStructure_minHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		//��
		Heap h = new Heap();
		
		//�� ����
		int temp = 0;
		
		//�Է� �޴� ��
		String command = "";
		
		//���� ���ڷ� �ٲ� ��
		int choice = 0;
		
		//��� ī��Ʈ ��
		int count = 0;
		
		//���� ���� ��
		int minVal = 0;
		
		//���� ���� ���� �ε���
		int minIndex = 0;
		
		
		
		
		// insert
		// select
		// delete
		// update
		
		
		try {
			
			command = buffer.readLine();
			count = Integer.parseInt(command);
			
			for (int i = 0; i < count; i++) {
				
				command = buffer.readLine();
				choice = Integer.parseInt(command);
				
				if (choice == 0) {
					if (h.size == 0) {
						System.out.println(0);
					} else {
						//���� ���� �� ���
						System.out.println(h.heap[0]);
						h.heap[0] = h.heap[h.size - 1];
						
						//���� ���� �� �迭���� ����
						
						for (int j = 0; j < h.size - 3; j++) {
							if (h.size - 3 >= j) {
								if (h.heap[j] > h.heap[j * 2]) {
									temp = h.heap[j];
									h.heap[j] = h.heap[j * 2];
									h.heap[j * 2] = temp;
								}
							}
						}
						h.size--;
					}					
				} else {
					for (int j = 0; j < h.size; j++) {						
						if (minVal >= h.heap[j]) {
							
						}
					}
					h.size++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Heap {
	Integer[] heap = new Integer[10001];
	int size;
}