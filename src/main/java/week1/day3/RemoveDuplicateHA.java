package week1.day3;

import java.util.Arrays;

public class RemoveDuplicateHA {
//This program will work only if there is a two duplicates.
	private void removeDuplicate() {
		// TODO Auto-generated method stub
		int[] inputNumbers= {90, 60, 40, 60, 10, 78, 78};
		Arrays.sort(inputNumbers);
		System.out.println(Arrays.toString(inputNumbers));
		for (int i = 0; i <= inputNumbers.length-1; i++) {
			if(i==inputNumbers.length-1) break;
			if(inputNumbers[i] == inputNumbers[i+1]) 
				System.out.println(inputNumbers[i]);
			else 
				continue;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateHA duplicate=new RemoveDuplicateHA();
		duplicate.removeDuplicate();
	}
}
