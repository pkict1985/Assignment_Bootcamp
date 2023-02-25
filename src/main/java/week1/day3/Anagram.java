package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello";
		String str2="elloh";
		//boolean equals = str1.equals(str2);
		//System.out.println(equals);
		char[] charArray1 = str1.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray2);
		boolean isAnagram=true;
//		for (int i = 0; i < charArray1.length; i++) {
//          if(== charArray2.charAt(i)) {
//        	  
//          }
//		}
	}

}
