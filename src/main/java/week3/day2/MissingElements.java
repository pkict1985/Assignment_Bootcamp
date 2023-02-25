package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElements {
	//using List 1to 10  [1,2,3,4,5,7,6,9,10]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here is the input
		//int[] arr= {1,2,3,4,5,7,6,9,10};
		int[] arr= {3,4};
		List<Integer> actualList=new ArrayList<Integer>();
		List<Integer>  dupElementsList=new ArrayList<Integer>();
		List<Integer>  missingList=new ArrayList<Integer>();
		int siz=arr.length;

		for(int i=1;i<=siz;i++) {
			actualList.add(arr[i-1]);
		}
		//Sort the list
		Collections.sort(actualList);
		System.out.println("Actual list is "+ actualList);

		List<Integer> seqList=new ArrayList<Integer>();
		//List<Integer> resultList=new ArrayList<Integer>();

		int max=Collections.max(actualList);

		for (int i = 1; i <= max; i++) {
			seqList.add(i);
		}
		
		System.out.println("The Sequential List is "+seqList);
	
		boolean v=false;
		for(int j=0;j<=seqList.size()-1;j++) {
			for(int k=0;k<=actualList.size()-1;k++) {
				if(seqList.get(j) != actualList.get(k)) {
					missingList.add(seqList.get(k));
				}
			}
		}
		//Set<Integer> resultSet=new TreeSet<Integer>(missingList);
		
		//System.out.println("Missing elements are " +resultSet);

		System.out.println(missingList);
	}
}