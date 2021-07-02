package backjoon_dataStructure_minHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		//힙
		Heap h = new Heap();
		
		//빈 공간
		int temp = 0;
		
		//입력 받는 값
		String command = "";
		
		//값을 숫자로 바꾼 값
		int choice = 0;
		
		//명령 카운트 수
		int count = 0;
		
		//첫 번째 자식의 인덱스
		int firChildIndex = 0;
		
		//두 번째 자식의 인덱스
		int secChildIndex = 0;
		
		//자식 인덱스 선택 값 0이면 부모 1이면 첫 자식 2이면 둘 자식
		int select = 0;
		
		int parentIndex = 0;
		
		try {
			
			command = buffer.readLine();
			count = Integer.parseInt(command);
			h.heap = new int[count + 1];
			
			for (int i = 0; i < count; i++) {
				
				command = buffer.readLine();
				choice = Integer.parseInt(command);
				
				if (choice == 0) {
					if (h.size == 0) {
						System.out.println(0);
					} else {
						//가장 작은 값 출력
						System.out.println(h.heap[0]);
						h.heap[0] = h.heap[--h.size];
						
						for (int j = 0; j < h.size; j++) {
							firChildIndex = j * 2;
							secChildIndex = j * 2 + 1;
							
							if (secChildIndex < h.size)
								if (h.heap[firChildIndex] < h.heap[secChildIndex])
									select = firChildIndex;
								else select = secChildIndex;
							else if (firChildIndex < h.size)
								select = firChildIndex;
							else select = 0;
							
							if (select != 0) {
								if (h.heap[select] < h.heap[j]) {
									temp = h.heap[j];
									h.heap[j] = h.heap[select];
									h.heap[select] = temp;
									j = select;
								}
							}
						}
					}					
				} else {
					h.heap[h.size] = choice;
					
					for (int j = h.size; j > 0; j--) {
						if (j % 2 == 0)
							parentIndex = (j - 2) / 2;
						else
							parentIndex = (j - 1) / 2;
					
						if (parentIndex != 0)
							if (h.heap[parentIndex] > h.heap[j]) { 
								temp = h.heap[j];
								h.heap[j] = h.heap[parentIndex];
								h.heap[parentIndex] = temp;
								j = parentIndex - 1;
								continue;
							}
					}
					h.size++;
				}
			}
		} catch (IOException e) {
			
		}
	}
}

class Heap {
	int[] heap;
	int size;
}