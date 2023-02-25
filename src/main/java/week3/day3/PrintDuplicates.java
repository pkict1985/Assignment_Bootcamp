package week3.day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {
	//Using Set
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,2};
		Set<Integer> set=new LinkedHashSet<Integer>();
		Set<Integer> duplicateSet=new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!set.add(arr[i])) duplicateSet.add(arr[i]);
		}
		System.out.println("Duplicates removed are " + duplicateSet);
	}
}
