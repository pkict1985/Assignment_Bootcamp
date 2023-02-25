
package week1.day3;

import java.util.Arrays;

public class RemoveDuplicateCorrectHA {
	private void removeDuplicate() {
		// TODO Auto-generated method stub
		int[] inputNumbers= {90, 60, 40, 60, 10, 78, 78, 78, 80};
		int[] result=new int[inputNumbers.length];
		Arrays.sort(inputNumbers);
		System.out.println(Arrays.toString(inputNumbers));

		int j=0;
		for (int i = 0; i <= inputNumbers.length-1; i++) {
			if(i==inputNumbers.length-1) {
				result[result.length-1]=inputNumbers[inputNumbers.length-1];
				System.out.println(result[result.length-1]);
				break;
			}
			if(inputNumbers[i] != inputNumbers[i+1]) {
				result[j]=inputNumbers[i];
				System.out.println(result[j]);
				j++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateCorrectHA duplicate=new RemoveDuplicateCorrectHA();
		duplicate.removeDuplicate();
	}

}
