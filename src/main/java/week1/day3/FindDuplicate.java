package week1.day3;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {14,18,19,14,18};
Arrays.sort(nums);
for (int i = 0; i < nums.length; i++) {
	System.out.println(nums[i]);
}
for (int i = 0; i < nums.length; i++) {
	if(nums[i]==nums[i+1]) {
		System.out.println(nums[i]);
	}
}
	}
}
