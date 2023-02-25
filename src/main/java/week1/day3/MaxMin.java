package week1.day3;

import java.util.Arrays;

public class MaxMin {
	//	int[] nums={22,987,998,-90,0,78,89};
	//	max->
	//	min->
	//	1)Create a new class MaxandMin with main method
	//	2)Create an int[] array with different data not in sorted order
	//	3)Write a logic to sort and find the min,max-
	//	4)Run and confirm the printed in console
	//	Hint:Use sort and find the min and max by index
	private void findMinMax() {
		// TODO Auto-generated method stub
		int[] nums={22,987,998,-90,0,78,89};
		int minNo, maxNo;
		int length=nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		minNo=nums[0];
		maxNo=nums[length-1];
		System.out.println("Max no is " + minNo);
		System.out.println("Min no is "+ maxNo);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMin mm=new MaxMin();
		mm.findMinMax();
	}

}
