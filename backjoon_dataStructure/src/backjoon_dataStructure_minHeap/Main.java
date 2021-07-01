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
		
		//가장 작은 값
		int minVal = 0;
		
		//가장 작은 값의 인덱스
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
						//가장 작은 값 출력
						System.out.println(h.heap[0]);
						h.heap[0] = h.heap[h.size - 1];
						
						//가장 작은 값 배열에서 제거
						
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