package backjoon_dataStructure_minHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		//배열
		Integer[] heaps;
		ArrayList<Integer> heap = new ArrayList<Integer>();
		
		//입력 받는 값
		String command = "";
		//값을 숫자로 바꾼 값
		int choice = 0;
		//명령 카운트 수
		int count = 0;
		//배열 사이즈
		int size = 0;
		//가장 작은 값
		int minVal = 0;
		//가장 작은 값의 인덱스
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
						//가장 작은 값 출력
						//가장 작은 값 배열에서 제거
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