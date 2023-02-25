package week1.day1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 1 2 3
		Integer[] input={0,3,1};
		int n=input.length-1;
		
		System.out.println("Input array is "+ Arrays.toString(input));
	    List<Integer> list=Arrays.asList(input);
		
		System.out.println("Sorted List is ");
		Collections.sort(list);
		
		for (int i=0;i<=n;i++) {
			System.out.println(list.get(i));
		}//0 1 3
		for (int i = 0; i <= n-1; i++) {
			
			if(list.get(i)+1 ==list.get(i+1)) {
				continue;
			}
			else {
				System.out.println(list.get(i)+1 + " is missing");
			}
		}
	}

}
