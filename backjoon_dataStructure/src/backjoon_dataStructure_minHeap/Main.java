package backjoon_dataStructure_minHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		//�迭
		Integer[] heaps;
		ArrayList<Integer> heap = new ArrayList<Integer>();
		
		//�Է� �޴� ��
		String command = "";
		//���� ���ڷ� �ٲ� ��
		int choice = 0;
		//��� ī��Ʈ ��
		int count = 0;
		//�迭 ������
		int size = 0;
		//���� ���� ��
		int minVal = 0;
		//���� ���� ���� �ε���
		int minIndex = 0;
		
		try {
			
			command = buffer.readLine();
			count = Integer.parseInt(command);
			
			heaps = new Integer[count];
			
			
			
			for (int i = 0; i < count; i++) {
				
				command = buffer.readLine();
				choice = Integer.parseInt(command);
				
				if (choice == 0) {
					if (size == 0) {
						System.out.println(size);
					} else {
						//���� ���� �� ���
						//���� ���� �� �迭���� ����
						for (int j = 0; j < size; j++) {
							
						}
						
						size--;
					}					
				} else {
					heaps[size] = choice;
					size++;
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}