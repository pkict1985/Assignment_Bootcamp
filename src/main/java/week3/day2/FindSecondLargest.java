package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargest {
//[2,1]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(6);
		list.add(1);
		//list.add(8);
	    int f,s, temp, size=list.size();
		for(int i=0;i<=size-1;i++)
		{
			if(i==size-1) break;
			if(list.get(i)>list.get(i+1)) {
				f=list.get(i);
				s=list.get(i+1);
				
				temp=f;
				f=s;
				s=temp;
			}
		}
		System.out.println(list);
		System.out.println("The second largest number is " + list.get(size-2));
	}

}
