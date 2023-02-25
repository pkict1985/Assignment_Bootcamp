package week3.day3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Classroom:
//==========
//   String companyName = "google"->"gole"
//   Remove duplicate character
public class LearnConstructor {
public static void main(String[] args) {
	String companyName="google";
	char[] arrCName=companyName.toCharArray();
	Set<Character> nameSet=new LinkedHashSet<Character>();
	for (int i = 0; i < arrCName.length; i++) {
		nameSet.add(arrCName[i]);
	}
	System.out.println(nameSet);
}
}
