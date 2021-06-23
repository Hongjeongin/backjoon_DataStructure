package backjoon_dataStructure_zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		Integer[] zero = new Integer[1000001];
		
		String num = "";
		
		int sum = 0;
		int count = 0;
		int arrayIndex = 0;
		
		try {
			count = Integer.parseInt(buffer.readLine());
			
			for (int i = 0; i < count; i++) {
				num = buffer.readLine();
				
				if (num.equals("0") && arrayIndex != 0) {
					arrayIndex--;
					sum-=zero[arrayIndex];
				} else {
					zero[arrayIndex] = Integer.parseInt(num);
					sum+=zero[arrayIndex];
					arrayIndex++;
				}
			}
			
		} catch (Exception e) {
		}
		System.out.println(sum);
	}
}