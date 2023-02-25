package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	//{1,2}{2,3} using the collection List
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		List<Integer> resultList=new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(4);
		
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		for(int i=0;i<=list1.size()-1;i++) {
			for(int j=0;j<=list2.size()-1;j++) {
				if(list1.get(i)==list2.get(j)) {
					resultList.add(list1.get(i));
				}
			}
		}
		
		System.out.println("Intersection "+ resultList);
	}
}
