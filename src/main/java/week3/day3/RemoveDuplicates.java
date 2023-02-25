package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	//using Set [1,2,4,2]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set removes the duplicates by default
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(8);
		System.out.println(set);
	}

}
